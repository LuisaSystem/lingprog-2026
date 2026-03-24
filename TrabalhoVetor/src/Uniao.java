import java.util.Scanner;
//corrigido com lógica exata

public class Uniao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vet = new int[5];
        int [] vet2 = new int[5];
        int [] vet3 = new int[10];

        //primeiro vet


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero para ter o terceiro vetor: ");
            vet[i] = ler.nextInt();

            vet3[i] = vet[i];
        }
        System.out.println("------------------------------------------------");

        //segundo vet

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero para ter o terceiro vetor:");
            vet2[i] = ler.nextInt();

            vet3[i+5] = vet2[i];
        }

        System.out.println("Gerado o terceiro vetor!");
        for (int num : vet3) {
            System.out.println(num+"  ");
        }
    }
}
