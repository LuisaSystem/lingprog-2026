public class ContaBancaria {
    public static void main(String[] args) {
        conta gmod = new conta("Lucas GM", "2003", 1000.50);

        conta.depositar(300.0);
        conta.sacar(150.0);

        //leitura sempre via getters
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());

        //alteração controlada via getter , com avaliação
        conta.getLimiteChequeEspecial();
        conta.getLimiteChequeEspecial(); //tejeitado

        // saldo não compila pq ele é PRIVATE.
    }
}
