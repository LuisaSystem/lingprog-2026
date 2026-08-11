public class estoqueApp {
    public static void main() {
        produto n1 = new produto("Demostração 1",23.60,7);
        produto n2 = new produto("Demostração x",45.00,5);
        produto n3 = new produto();
        produto n4 = new produto("",55.55,3);

        n1.vender(3);
        n1.repor(12);
        n1.exibirDados();

        n2.vender(1);
        n2.repor(5);
        n2.exibirDados();

        n3.vender(9);
        n3.repor(8);
        n3.exibirDados();

        n4.vender(2);
        n4.repor(56);
        n4.exibirDados();

        System.out.println("-------------------------------");
        System.out.println("Produtos cadastrados: " + produto.getTotalProdutos());
    }
}
