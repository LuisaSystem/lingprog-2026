import java.util.Scanner;

public class Fibonacci {
    public static void main() {
        Scanner lol = new Scanner(System.in);

        //pedido
        System.out.println("--- Sequência de Fibonacci ---");
        System.out.println("Quantas vezes você quer que a seuqência vá?");
        int qtd = lol.nextInt();

        long numo = 0;
        long numat = 1;

        for(int i=1; i<=qtd; i++){

            long prox = numo+numat;
            System.out.println(numo+"  ");

            numo = numat;
            numat = prox;
        }
        System.out.println("Finalização da sequência!");

    }
}
