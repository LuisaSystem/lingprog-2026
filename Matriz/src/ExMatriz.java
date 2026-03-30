import java.util.Scanner;
public class ExMatriz {
    // laços alinhados
    public static void main(String[] args) {
        //Scanner ler = new Scanner(System.in);

        float [][] notas = new float[3][4];

       float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
               // System.out.println("\n Coloque as 4 notas do bimestre: ");
                notas[i][j] = (float) (Math.random() * 10);
                System.out.printf("%.2f   ", notas[i][j]);

                soma+=notas[i][j];
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------");
            float nota = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do "+(i+1)+"º Aluno!");
            nota += notas[i];
            System.out.printf("%.2f   ",nota);
        }

        for (int i = 0; i < notas[0].length; i++) {
            System.out.println("Notas da "+(i+1)+"º prova!");
            System.out.printf("%.2f   ",notas[i]);
        }


       float media = notas.length * notas[0].length;
        System.out.printf("\n A média das notas é %.2f ", soma/media);

    }
}