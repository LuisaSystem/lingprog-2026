import java.lang.reflect.Array;
import java.util.Scanner;

public class Uniao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //primeiro vet

        int [] vet = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero para ter o terceiro vetor: ");
            vet[i] = ler.nextInt();
        }
        System.out.println("------------------------------------------------");

        //segundo vet
        int [] vet2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero para ter o terceiro vetor:");
            vet2[i] = ler.nextInt();

            vet2[i] = vet.length;
        }

        int [] vet3 = new int[10];
        for (int i = 0; i < 10; i++) {
            vet3[i] = vet2.length + vet.length;
            System.out.println(vet3.length+" ");
            System.out.println("Gerado o terceiro vetor!");
        }
    }
}
