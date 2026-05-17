import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void criarTabela(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS livros(" +
                    "id SERIAL PRIMARY KEY," +
                    "titulo TEXT NOT NULL," +
                    "autor TEXT NOT NULL," +
                    "ano INTEGER NOT NULL," +
                    "disponivel INTEGER NOT NULL)";

        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.close();
    }

    public static void insere(Connection conn, Scanner sc) throws SQLException{
        //pergunta
        System.out.println("INFORME O TITULO DO LIVRO: ");
        String titulo = sc.next();
        System.out.println("INFORME O AUTOR DO LIVRO: ");
        String autor = sc.next();
        System.out.println("INFORME O ANO DO LIVRO: ");
        int ano = sc.nextInt();
        System.out.println("INFORME SE O LIVRO ESTÁ DISPONIVEL(1) ou NÂO(0): ");
        int disponivel = sc.nextInt();

        String sql = "INSERT INTO livros(titulo, autor, ano, disponivel) values (?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, titulo);
        ps.setString(2, autor);
        ps.setInt(3, ano);
        ps.setInt(4, disponivel);
        //executar
        ps.executeUpdate();
        System.out.println("Inserção feita com sucesso!");
        ps.close();

    }

    public static void consulta(Connection conn) throws SQLException{
        //consulta
        String sql = "SELECT * FROM livros ORDER BY titulo";

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()){
            int id = rs.getInt("id");
            String titulo = rs.getString("titulo");
            String autor = rs.getString("autor");
            int ano = rs.getInt("ano");
            int disponivel = rs.getInt("disponivel");
            System.out.printf("[%d] %s - R$ %.2f (disponivel: %d)%n", id, titulo, autor, ano, disponivel);
        }

    }

    public static void deletar(Connection conn, Scanner sc) throws SQLException{
        //pergunta
        System.out.println("DIGITE O ID PARA DELETAR: ");
        int id = sc.nextInt();
        //

        String sql = "DELETE FROM livros WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int linhasafetadas = ps.executeUpdate();
        ps.close();

        if (linhasafetadas > 0){
            System.out.println("APAGADO COM SUCESSO!");
        }else {
            System.out.println("ID NÂO IDENTIFICADO!");
        }
    }

    public static void atualizar(Connection conn, Scanner sc) throws SQLException{
        //pergunta
        System.out.println("QUAL O ID PARA ATUALIZAR? - ");
        int id = sc.nextInt();
        System.out.println("INFORME O NOVO PRECO DO PRODUTO: ");
        int novoDisponivel = sc.nextInt();
        //

        String sql = "UPDATE livros SET disponivel = ? WHERE id = ?";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, novoDisponivel);
        ps.setInt(2, id);
        int linhasafetadas = ps.executeUpdate();
        if (linhasafetadas > 0){
            System.out.println("Está disponivel agora!");
        }else{
            System.out.println("Produto não identificado!");
        }
    }

    //perfumaria
    public static void exibirMenu(){
        System.out.println("\n ✧･ﾟ: *✧･ﾟ:* DANIEL'S LIBRARY *:･ﾟ✧*:･ﾟ✧");
        System.out.println("1. Inserir livro(s)?");
        System.out.println("2. Atualizar livro(s)?");
        System.out.println("3. Consultar livro(s)?");
        System.out.println("4. Deletar livro(s)?");
        System.out.println("0. Sair?");
        System.out.println("Opção? :");
    }



    //esqueleto da opções
    public static void Opcoes(Connection conn, Scanner sc, int opcao) throws SQLException{
        switch (opcao){
            case 1: insere(conn, sc);break;
            case 2: atualizar(conn, sc);break;
            case 3: consulta(conn);break;
            case 4: deletar(conn,sc);break;
            case 0:
                System.out.println("Programa encerrado ~[...]"); break;
            default:
                System.out.println("NÃO EXITE ESTA OPÇÂO! >:[");
        }
    }


    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/biblio";
        try {
            Connection conn = DriverManager.getConnection(url,"postgres", "fatec123*");
            System.out.println("Conexão feita!");
            criarTabela(conn);

            Scanner sc = new Scanner(System.in);
            int opcao = 1;

            do {
                exibirMenu();
                opcao = sc.nextInt();
                sc.nextLine();
                Opcoes(conn,sc, opcao);
            }while (opcao != 0);

            consulta(conn);

        } catch (SQLException e) {
            System.out.println("Algo está errado!" +e.getMessage());
        }
    }
}
