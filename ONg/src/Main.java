import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main{

  //criar a tabela
public static void criarTabelaclientes(Connection conn) throws SQLException{
  String sql = "CREATE TABLE IF NOT EXISTS clientes(" +
                "id SERIAL PRIMARY KEY," +
                "nome TEXT NOT NULL," +
                "endereco TEXT NOT NULL," +
                "telefone TEXT NOT NULL," +
                "data_aniver date NOT NULL," +
                "cpf TEXT NOT NULL," +
                "email TEXT NOT NULL)";
    Statement stmt = conn.createStatement();
    stmt.execute(sql);
    stmt.close();
}
  public static void criarTabelaprodutos(Connection conn) throws SQLException{
    String sql = "CREATE TABLE IF NOT EXISTS produtos(" +
            "id SERIAL PRIMARY KEY," +
            "categoria TEXT NOT NULL," +
            "tamanhos TEXT NOT NULL, " +
            "preco REAL NOT NULL," +
            "desconto REAL NOT NULL, " +
            "quantidade INTEGER DEFAULT 0)";
    Statement stmt = conn.createStatement();
    stmt.execute(sql);
    stmt.close();
  }
  public static void criarTabelafuncionarios(Connection conn) throws SQLException{
    String sql = "CREATE TABLE IF NOT EXISTS funcionarios(" +
            "id SERIAL PRIMARY KEY," +
            "nome TEXT NOT NULL," +
            "endereco TEXT NOT NULL," +
            "telefone TEXT NOT NULL," +
            "data_aniver date NOT NULL," +
            "email TEXT NOT NULL," +
            "senha TEXT NOT NULL)";
    Statement stmt = conn.createStatement();
    stmt.execute(sql);
    stmt.close();
  }
/// ////////////////////////////////////////////////////////////////////////////////////////////

public static void inserir(Connection conn, Scanner sc) throws SQLException{

  //criando a inserção
  String sql = "INSERT INTO clientes(nome, endereco, telefone, data_niver, cpf, email) values(?, ?, ?, ?, ?, ?)";


}





















  //não mexer ao tudo
  public void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/iansa";
    try {
      Connection conn = DriverManager.getConnection(url, "postgres", "fatec123*");
      System.out.println("Conexão feita!");

      // tables :3
      criarTabelaclientes(conn);
      criarTabelaprodutos(conn);
      criarTabelafuncionarios(conn);

      // Scaner
      Scanner sc = new Scanner(System.in);


    } catch (SQLException e) {
      System.out.println("Erro! "+ e.getMessage());
    }
  }
}
