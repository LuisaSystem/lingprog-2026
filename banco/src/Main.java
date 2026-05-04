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
    }
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/lojaD";
        try {// criando a conexão
            Connection conn = DriverManager.getConnection(url, "postgres","fatec123*");
            System.out.println("Conexão Sucedida!");
            criarTabelas(conn);
            insere(conn, "mouse", 158, 3);
        }catch (SQLException e){
            System.out.println("Deu errado!" + e.getMessage());
        }
    }
}