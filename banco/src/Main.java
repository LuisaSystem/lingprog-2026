import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void criarTabelas(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS produtos("+
                     "id SERIAL PRIMARY KEY, " +
                     "nome TEXT NOT NULL," +
                     "preco REAL NOT NULL," +
                     "estoque INTEGER DEFAULT 0)";
        //cria objeto de instrução do SQL
        Statement stmt = conn.createStatement();
        stmt.execute(sql);// executa o comando SQL
        stmt.close();// fecha instrução
    }
    public static void insere(Connection conn, Scanner sc) throws SQLException{
        // lendo os campos
        System.out.println("Infrome o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Infrome o preco do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Infrome a quantidade do estoque: ");
        int estoque = sc.nextInt();

        //criar a inserção
        String sql = "INSERT INTO produtos(nome, preco, estoque) values(?, ?, ?)";
        // prepara uma instrução SQL
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setDouble(2, preco);// definido os atributos :3
        ps.setInt(3, estoque);
        ps.executeUpdate();
        System.out.println("Produto inserido!");
        ps.close();
    }// aula 04/05

    public static  void consulta(Connection conn) throws SQLException{
        //criando o comando SQL
        String sql = "SELECT * FROM produtos ORDER BY nome";

        //cria statement
        Statement stmt = conn.createStatement();
        //executa e consulta o resultado em rs
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");
            int estoque = rs.getInt("estoque");
            System.out.printf("[%d] %s - R$ %.2f (estoque: %d)%n", id, nome, preco, estoque);
        }
    }

    public static void deletar(Connection conn, Scanner sc) throws SQLException{
        // recebendo o id do usuario
        System.out.println("Localize o numero do id: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM produtos WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int linhasafetadas = ps.executeUpdate();
        ps.close();

        if (linhasafetadas > 0){
            System.out.println("APAGADO COM SUCESSO!");
        }else{
            System.out.println("ID NÃO ENCONTRADO!");
        }
    }// aula 05/05

    public static void atualizarpreco(Connection conn, Scanner sc) throws SQLException{
        // recebendo novopreco e id
        System.out.println("Qual o id para atualizar? : ");
        int id = sc.nextInt();
        System.out.println("Infrome o novo preco do produto: ");
        double novoPreco = sc.nextDouble();


        String sql = "UPDATE produtos SET preco = ? WHERE id =?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, novoPreco);
        ps.setInt(2, id);
        int linhasafetadas = ps.executeUpdate();
        if (linhasafetadas > 0){
            System.out.println("Preço atualizado!");
        }else {
            System.out.println("Produto não encontrado!");
        }
    }

    public static void exibirMenu(){
        System.out.println("\n Menu CRUD de produtos");
        System.out.println("1. Listar produtos");
        System.out.println("2. Inserir produtos");
        System.out.println("3. Atualizar produtos");
        System.out.println("4. Remover produtos");
        System.out.println("0 - Sair.");
        System.out.println("opção? :");

    }

    public static void processarOpcao(Connection conn, Scanner sc, int opcao) throws SQLException{
        switch (opcao){
            case 1:consulta(conn); break;
            case 2:insere(conn, sc); break;
            case 3:atualizarpreco(conn, sc); break;
            case 4:deletar(conn, sc); break;
            case 0: System.out.println("Encerrado!"); break;
            default: System.out.println("Não há essa opção!");
        }
    }


    // aula 11/05

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/lojaD";
        try {// criando a conexão
            Connection conn = DriverManager.getConnection(url, "postgres","fatec123*");
            System.out.println("Conexão Sucedida!");
            criarTabelas(conn);

            // parte 2 - aula 11/05
            Scanner sc = new Scanner(System.in);
            int opcao = 1;

            do {
                exibirMenu();
                opcao = sc.nextInt();
                sc.nextLine();
                processarOpcao(conn, sc, opcao);
            }while (opcao != 0);

        }catch (SQLException e){
            System.out.println("Deu errado!" + e.getMessage());
        }
    }
}