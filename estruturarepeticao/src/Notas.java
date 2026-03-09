import java.util.Scanner;
// break; força a saida com a condição.
// continue; passa para a proxima interação.
public class Notas {
    public static void main(String[] args){
        Scanner yu = new Scanner(System.in);

        /*float nota = 0;
        float soma = 0;
        int cond = 1;

        while(cond <= 10){
            System.out.println("Insira as 10 notas: ");
            nota = yu.nextInt();
            if (nota < 0 || nota > 10){
                break;
            }
            soma += nota;
            cond++;
        }

        if (cond == 11){
            float media = soma / 10;
            System.out.println("Total das notas: " + media);
        }else {
            System.out.println("Nota não identificada!");
        }*/

        int cond = 1;
        float nota = 0;
        float soma = 0;

        while (cond <= 5){
            System.out.println("Notes: ");
            nota = yu.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println("Tente novamente!");
                continue;
            }
            cond++;
            soma+=nota;
        }
        float media = soma/5;
        System.out.println("Média é: "+ media);

    }
}
