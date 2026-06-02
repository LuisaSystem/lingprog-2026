import java.sql.*;
import java.time.LocalDate;
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
                "cpf TEXT UNIQUE NOT NULL," +
                "email TEXT UNIQUE NOT NULL)";
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
            "cpf TEXT UNIQUE NOT NULL," +
            "email TEXT UNIQUE NOT NULL," +
            "senha TEXT NOT NULL)";
    Statement stmt = conn.createStatement();
    stmt.execute(sql);
    stmt.close();
  }
//======INSERÇÃO========================================================================================================

  public static void inserirCliente(Connection conn, Scanner sc) throws SQLException{
    //perguntas

    System.out.println("QUal o nome do cliente? ");
    sc.nextLine();
    String nome = sc.next();
    System.out.println("QUal o endereço do cliente? ");
    String endereco = sc.next(); sc.nextLine();
    System.out.println("QUal o telefone do cliente? ");
    String telefone = sc.next();sc.nextLine();
    System.out.println("QUal a data de nascimento do cliente? (aaaa-mm-dd)");
    String data_niver_str = sc.next();
    LocalDate data_niver = LocalDate.parse(data_niver_str); sc.nextLine();
    System.out.println("QUal o CPF do cliente? ");
    String cpf = sc.next(); sc.nextLine();
    System.out.println("QUal o email do cliente? ");
    String email = sc.next(); sc.nextLine();

    //criando a inserção
    String sql = "INSERT INTO clientes(nome, endereco, telefone, data_niver, cpf, email) values(?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, nome);
    ps.setString(2, endereco);
    ps.setString(3, telefone);
    ps.setDate(4, Date.valueOf(data_niver));
    ps.setString(5, cpf);
    ps.setString(6, email);
    System.out.println("Cliente "+nome+" inserido com sucesso!");
  }// inserir clientes


  public static void inserirProduto(Connection conn, Scanner sc) throws SQLException{
    System.out.println("Qual o produto? (EX.: Vestido-Novo)");
    sc.nextLine();
    String categoria = sc.nextLine();
    System.out.println("Qual o tamanho do produto? ");
    String tamanhos = sc.next(); sc.nextLine();
    System.out.println("Qual o preco do produto? ");
    double preco = sc.nextDouble(); sc.nextLine();
    System.out.println("Qual o valor de desconto? (Se não tiver desconto, coloque 0.)");
    double desconto = sc.nextDouble(); sc.nextLine();
    System.out.println("Quantos estão disponíveis no estoque?");
    int quantidade = sc.nextInt(); sc.nextLine();

    //função desconto
     if(desconto == 0){
        desconto = 0.0;
     }else {
       double valorT = preco * quantidade;
       desconto = valorT - desconto;
     }


    //criando a inserção
    String sql = "INSERT INTO produtos (categoria, tamanhos, preco, desconto, quantidade) values(?, ?, ?, ?, ?)";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, categoria);
    ps.setString(2, tamanhos);
    ps.setDouble(3, preco);
    ps.setDouble(4, desconto);
    ps.setInt(5, quantidade);
    ps.executeUpdate();
    System.out.println("Produto "+categoria+" tamanho: "+tamanhos+" com o preco R$: "+preco+"Valopr do desconto: "+desconto+", da quantidade: "+quantidade+"!");
  }


  // inserir produtos

  public static void inserirFuncionario(Connection conn, Scanner sc) throws SQLException{
    System.out.println("QUal o nome do funcionário? ");
    sc.nextLine();
    String nome = sc.next();
    System.out.println("QUal o endereço do funcionário? ");
    String endereco = sc.next(); sc.nextLine();
    System.out.println("QUal o telefone do funcionário? ");
    String telefone = sc.next(); sc.nextLine();
    System.out.println("QUal a data de nascimento do funcionário? (aaaa-mm-dd)");
    String data_niver_str = sc.next();
    LocalDate data_niver = LocalDate.parse(data_niver_str); sc.nextLine();
    System.out.println("Qual o CPF do funcionário?");
    String cpf = sc.next(); sc.nextLine();
    System.out.println("QUal o email do funcionário? ");
    String email = sc.next(); sc.nextLine();
    System.out.println("QUal o CPF do funcionário? ");
    String senha = sc.next(); sc.nextLine();

    //criando a inserção
    String sql = "INSERT INTO funcionarios(nome, endereco, telefone, data_niver, cpf, email, senha) values(?, ?, ?, ?, ?, ?, ?)";



    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, nome);
    ps.setString(2, endereco);
    ps.setString(3, telefone);
    ps.setDate(4, Date.valueOf(data_niver));
    ps.setString(5, cpf);
    ps.setString(6, email);
    ps.setString(7, senha);
    ps.executeUpdate();
    System.out.println("Funcionário "+nome+" inserido com sucesso!");
    ps.close();

  }// cadastro do funcionário

//=====CONSULTA=========================================================================================================
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
      String nome = rs.getString("nome");
      String endereco = rs.getString("endereco");
      String telefone = rs.getString("telefone");
      Date data_niver = rs.getDate("data_niver");
      String cpf = rs.getString("cpf");
      String email = rs.getString("email");
      String senha = rs.getString("senha");
      System.out.printf("[%d] %s - R$ %.2f (nome: %d)%n", id, nome, endereco, telefone, data_niver, cpf, email, senha);
    }


  }// consulta o funcionario

  //============DELETE==================================================================================================

  public static void deletarCliente(Connection conn, Scanner sc) throws SQLException{
    System.out.println("Digite o ID para ser delatado?");
    int id = sc.nextInt();

    String sql = "DELETE FROM clientes WHERE id =?";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, id);

    int linhasafetadas = ps.executeUpdate();
    ps.close();

    if (linhasafetadas > 0){
      System.out.println(id+" - APAGADO COM SUCESSO!");
    }else {
      System.out.println(+id+" - NÂO INDENTIFICADO!");
    }
  }

  public static void deletarProdutos(Connection conn, Scanner sc) throws SQLException{
    //pergunta
    System.out.println("Digite o ID para ser delatado?");
    int id = sc.nextInt();

    String sql = "DELETE FROM produtos WHERE id =?";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, id);

    int linhasafetadas = ps.executeUpdate();
    ps.close();

    if (linhasafetadas > 0){
      System.out.println(id+" - APAGADO COM SUCESSO!");
    }else {
      System.out.println(+id+" - NÂO INDENTIFICADO!");
    }
  }

  public static void deletarFuncionarios(Connection conn, Scanner sc) throws SQLException{
    //pergunta
    System.out.println("Digite o ID para ser delatado?");
    int id = sc.nextInt();

    String sql = "DELETE FROM funcionarios WHERE id =?";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, id);

    int linhasafetadas = ps.executeUpdate();
    ps.close();

    if (linhasafetadas > 0){
      System.out.println(id+" - APAGADO COM SUCESSO!");
    }else {
      System.out.println(+id+" - NÂO INDENTIFICADO!");
    }
  }// delete

//===========ATUALIZAÇÃO================================================================================================
  public static void atualizarCliente(Connection conn, Scanner sc) throws SQLException{
    System.out.println("Qual o id para ser atualizado?");
    int id = sc.nextInt();
    System.out.println("Informe o novo nome: ");
    String novoNome = sc.next();
    System.out.println("Informe o novo endereço: ");
    String novoEndereco = sc.next();
    System.out.println("Informe o novo telefone: ");
    String novoTel = sc.next();
    System.out.println("Informe o novo email: ");
    String novoEmail = sc.next();

    String sql = "UPDATE clientes SET nome = ?, endereco = ?, telefone = ?, email =? WHERE id = ?";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, novoNome);
    ps.setString(2, novoEndereco);
    ps.setString(3, novoTel);
    ps.setString(4, novoEmail);
    ps.setInt(5, id);

  }

  public static void atualizarFuncionario(Connection conn, Scanner sc) throws SQLException{
    System.out.println("Informe o id que queira mudar: ");
    int id = sc.nextInt();
    System.out.println("Informe o novo nome: ");
    String novoNome = sc.next();
    System.out.println("Informe o novo endereco: ");
    String novoEndereco = sc.next();
    System.out.println("Informe o novo telefone: ");
    String novoTel = sc.next();
    System.out.println("Informe o novo email: ");
    String novoEmail = sc.next();
    System.out.println("Informe a nova senha: ");
    String novaSenha = sc.next();
    String sql = "UPDATE funcionarios SET nome = ?, endereco = ?, telefone = ?, email =?, senha = ?  WHERE id = ?";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, novoNome);
    ps.setString(2, novoEndereco);
    ps.setString(3, novoTel);
    ps.setString(4, novoEmail);
    ps.setString(5, novaSenha);
    ps.setInt(6, id);

  }

  public static void atualizarProduto(Connection conn, Scanner sc) throws SQLException{
    System.out.println("Infrome o id que queira atualizar: ");
    int id = sc.nextInt();
    System.out.println("Informe a nova categoria: ");
    String novoCategoria = sc.next();
    System.out.println("Informe o novo preço: R$ ");
    double novoPreco = sc.nextDouble();
    System.out.println("Informe o novo tamanho: ");
    String novoTamanho = sc.next();
    System.out.println("Informe o novo desconto (se não tiver, coloque: 0): ");
    double novoDesconto = sc.nextDouble();
    System.out.println("Informe a quantidade: ");
    int novoQtd = sc.nextInt();

    String sql = "UPDATE clientes SET categoria = ?, tamanho = ?, preco = ?, desconto = ?, quantidade = ? WHERE id = ?";

    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, novoCategoria);
    ps.setDouble(2, novoPreco);
    ps.setString(3, novoTamanho);
    ps.setDouble(4, novoDesconto);
    ps.setInt(5, novoQtd);
    ps.setInt(6, id);

  }
//=====================================================================================================================


  public static void MENU(){
   System.out.println("\n MENU ONG IANSA");
   System.out.println("1. Inserir Produto/Cliente/Funcionário");
   System.out.println("2. Consultar Produto/Cliente/Funcionário");
   System.out.println("3. Atualizar Produto/Cliente/Funcionário");
   System.out.println("4. Deletar Produto/Cliente/Funcionário");
   System.out.println("0. Sair");
   System.out.println("qual a opção?: ");
 }

  public static void processarOpcao(Connection conn, Scanner sc, int op) throws SQLException{
    switch (op){
      case 1:
         System.out.println("Você quer inserir Produto (p), Cliente (c) ou Funcionário (f)? ");
          String aq = sc.next();
          if (aq.equals("p")){
            inserirProduto(conn, sc);
          } else if (aq.equals("c")) {
            inserirCliente(conn, sc);
          }else {
            inserirFuncionario(conn, sc);
          }
        break;
      case 2:
        System.out.println("Você quer consultar Produto (p), Cliente (c) ou Funcionário (f)? ");
         aq = sc.next();
        if (aq.equals("p")){
          consultarProduto(conn);
        } else if (aq.equals("f")) {
          consultarFuncionario(conn);
        }

        break;
        case 3:
          System.out.println("Você quer atualizar Produto (p), Cliente (c) ou Funcionário (f)? ");
            aq = sc.next();
          if (aq.equals("p")){
            inserirProduto(conn, sc);
          } else if (aq.equals("c")) {
            inserirCliente(conn, sc);
          }else {
            inserirFuncionario(conn, sc);
          }
          break;
    }
  }








  //não mexer demais
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/iansa";
    try {
      Connection conn = DriverManager.getConnection(url, "postgres", "fatec123*");
      System.out.println("Conexão feita!");

      // tables :3 (não mexer)
      criarTabelaclientes(conn);
      criarTabelaprodutos(conn);
      criarTabelafuncionarios(conn);
      //

      // Scaner
      Scanner sc = new Scanner(System.in);
      int op = 1;
      //String op2 = "";

      //exibição do menu
      do {
        MENU();
        op = sc.nextInt();
        sc.nextLine();
        processarOpcao(conn, sc, op);
      }while (op != 0);

    } catch (SQLException e) {
      System.out.println("Erro! "+ e.getMessage());
    }
  }
}
