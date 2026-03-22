import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class nomeinvensor{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String aq = "";
        String[] nomes = new String[5];
        int tamanho = nomes.length;

        for (int i=1; i<5; i++){
            System.out.println("Digite 5 nomes par serem invertidos: ");
            nomes[i] = ler.next();
        }
        for(int i=1; i<5; i++){
            Collections.reverse(Arrays.asList(nomes[i]));
            System.out.println(nomes[i]);
        }
    }
}
