import java.util.Scanner;

// ~ QUARTO EMAGRECIMENTO ~

public class Maior_Menor {
    public static void maiorOumenor(int [] num ){
        Scanner pop = new Scanner(System.in);

        //processo 1 ---- certo

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um número qualquer: ");
            num[i] = pop.nextInt();
        }

        //processo 2 ---- faltou definir as posições e o número maior ou menor
        double maior = num[0], menor = num[0];
        int posMaior = 0, posMenor = 0;

        for (int i = 1; i < num.length ; i++) {
            if (num[i]> maior){
                maior = num[i];
                posMaior = i;
            }
            if (num[i] < menor){
                menor = num[i];
                posMenor = i;
            }
        }

        System.out.println("Numero: "+maior+" na posição: "+posMaior);
        System.out.println("Numero: "+menor+" na posição: "+posMenor);



    }
    public static void main(String[] args) {
        int [] num = new int[10];
        maiorOumenor(num);
    }
}
