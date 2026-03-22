import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maior_Menor {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);

        int [] num = new int[10];

        //processo 1

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número qualquer: ");
            num[i] = pop.nextInt();
        }

        //processo 2

        if (num.length < 10){
            System.out.println("Seu maior número é: "+ Arrays.toString(num)+". Na posição >>"+(num.length+1));
        }else {
            System.out.println("Seu menor número é: "+Arrays.toString(num)+". Na posição >>"+(num.length+1));
        }
    }
}
