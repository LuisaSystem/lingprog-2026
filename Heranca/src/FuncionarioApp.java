public class FuncionarioApp {
    public static void main(String[] args) {
        funcionario fu = new funcionario("Breno", 3000);
        System.out.println("Dados do Breno");
        fu.exibiDados();

        gerente de = new gerente("Ana", 5000, 1000000);
        System.out.println("Gerente Ana");
        de.exibiDados();

        vendedor ve = new vendedor("Jenshi", 9000,89);
        System.out.println("Vendedor Jenshi");
        ve.exibiDados();
    }
}
