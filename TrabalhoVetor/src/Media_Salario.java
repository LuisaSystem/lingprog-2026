import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Media_Salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // os 5 nomes
        String [] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os nomes dos funcionários: ");
            nomes[i]= ler.next();

        }

        // 5 salarios
        float media = 0;
        float [] sal = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Agora, os slarios deles: R$");
            sal[i] = ler.nextFloat();
            media+=sal[i];
        }

        if (media > 1.600f){
            System.out.println("Nomes:\n "+ Arrays.asList(nomes)+", \ne salário de R$"+media+"  ");
        }else if (media < 1.600f){
            System.out.println("Nomes:\n "+ Arrays.asList(nomes)+", \ne salário de R$"+media+" ");
        }

        //System.out.println("Salários: R$\n "+ sal) "  ");

    }
}
