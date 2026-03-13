import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner lo = new Scanner(System.in);

        // pedido
        System.out.println("Quantas vezes você quer somar um número?");
        int num = lo.nextInt();
        System.out.println("========================================");

        // Resolver
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Qual é o número para somar?");
            int sal = lo.nextInt();
            cont+=sal;
        }

        System.out.println("----------------------------------------");
        System.out.println("Soma total: "+cont);

    }
}
