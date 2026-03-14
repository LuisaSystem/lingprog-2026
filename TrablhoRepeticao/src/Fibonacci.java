import java.util.Scanner;

public class Fibonacci {
    public static void main() {
        Scanner lol = new Scanner(System.in);

        //pedido
        System.out.println("--- Sequência de Fibonacci ---");
        System.out.println("Quantas vezes você quer que a seuqência vá?");
        int qtd = lol.nextInt();

        int num = 1;
        for(int i=1; i<=qtd; i++){
               num = num+2;
               System.out.println(num);
        }


    }
}
