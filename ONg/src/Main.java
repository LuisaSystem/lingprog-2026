import java.sql.*;
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

  public static void inserirCliente(Connection conn, Scanner sc) throws SQLException{

    //criando a inserção
    String sql = "INSERT INTO clientes(nome, endereco, telefone, data_niver, cpf, email) values(?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, nome);
    ps.setString(2, endereco);
    ps.setString(3, telefone);
    ps.setDate(4, data_niver);
    ps.setString(5, cpf);
    ps.setString(6, email);

  }// clientes
  public static void inserirProduto(Connection conn, Scanner sc) throws SQLException{

    //criando a inserção
    String sql = "INSERT INTO produtos (categoria, tamanhos, preco, desconto, quantidade) values(?, ?, ?, ?, ?)";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, categoria);
    ps.setString(2, tamanhos);
    ps.setDouble(3, preco);
    ps.setDouble(4, desconto);
    ps.setInt(5, quantidade);
    ps.executeUpdate();
    System.out.println("Produto "+categoria+" tamanho: "+tamanhos+" com o preco R$: "+preco+" desconto: "+desconto+", da quantidade: "+quantidade+"!");
  }// inserir produtos

  public static void inserirFuncionario(Connection conn, Scanner sc) throws SQLException{

    //criando a inserção
    String sql = "INSERT INTO funcionarios(nome, endereco, telefone, data_niver, email, senha) values(?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, nome);
    ps.setString(2, endereco);
    ps.setString(3, telefone);
    ps.setDate(4, data_niver);
    ps.setString(5, email);
    ps.setString(6, senha);
    ps.executeUpdate();
    System.out.println("Funcionário "+nome+" inserido com sucesso!");
    ps.close();

  }// cadastro do funcionário

public static void consultarProduto(Connection conn) throws SQLException{

  String sql = "SELECT * FROM produtos ORDER BY nome";

  Statement stmt = conn.createStatement();
  ResultSet rs = stmt.executeQuery(sql);

  while (rs.next()){
    int id = rs.getInt("id");
    String categoria = rs.getString("categoria");
    String tamanhos = rs.getString("tamanhos");
    double preco = rs.getDouble("preco");
    double desconto = rs.getDouble("desconto");
    int quantidade = rs.getInt("quantidade");
    System.out.printf("[%d] %s - R$ %.2f (quantidade: %d)%n", id, categoria,tamanhos, preco, desconto, quantidade);
  }


}

  public static void consultarFuncionario(Connection conn) throws SQLException{

    String sql = "SELECT * FROM funcionarios ORDER BY nome";

    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);

    while (rs.next()){
      int id = rs.getInt("id");
      String categoria = rs.getString("categoria");
      String tamanhos = rs.getString("tamanhos");
      double preco = rs.getDouble("preco");
      double desconto = rs.getDouble("desconto");
      int quantidade = rs.getInt("quantidade");
      System.out.printf("[%d] %s - R$ %.2f (quantidade: %d)%n", id, categoria,tamanhos, preco, desconto, quantidade);
    }


  }
















  //não mexer ao tudo
  public static void main(String[] args) {
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
