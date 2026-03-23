import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class nomeinvensor{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[5];
        int tamanho = nomes.length;

        for (int i=1; i< nomes.length; i++){
            System.out.println("Digite 5 nomes par serem invertidos: ");
            nomes[i] = ler.next();
        }

        // processo do resultado inverso
        System.out.println("O resultado agora inverso: ");
        for(int i= nomes.length - 1 ; i>=0; i--){//corrigido
            System.out.println(nomes[i]);
        }

    }
}
