import java.sql.*;

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
        System.out.println("Tabela criada com sucesso!");
    }
    public static void insere(Connection conn, String nome, double preco, int estoque) throws SQLException{
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
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/lojaD";
        try {// criando a conexão
            Connection conn = DriverManager.getConnection(url, "postgres","fatec123*");
            System.out.println("Conexão Sucedida!");
            criarTabelas(conn);
            insere(conn, "placa de video", 1100, 85);
            consulta(conn);
        }catch (SQLException e){
            System.out.println("Deu errado!" + e.getMessage());
        }
    }
}