import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        int number = ha.nextInt();

        // fatoração
        int fatorial = 1;
        for (int i=1; i<=number; i++){
            fatorial *= i;
        }
        System.out.println("====================");
        System.out.println("Fatorial de "+number+" é: "+fatorial);
    }
}
