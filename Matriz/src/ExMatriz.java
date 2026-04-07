import java.util.Scanner;
public class ExMatriz {
   public static void lerMediaGeral(float [][] notas){

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

       float mediaGeral = notas.length * notas[0].length;
       System.out.printf("\n A média das notas é %.2f ", soma/mediaGeral);
   }
   
    // laços alinhados
    public static void main(String[] args) {
        //Scanner ler = new Scanner(System.in);

        float [][] notas = new float[3][4];
        lerMediaGeral(notas);


        System.out.println("-----------------------------------------");

        for (int i = 0; i < notas.length; i++) { // aluno only
            float acum = 0;
            for (int j = 0; j < notas[0].length ; j++) {
                acum+=notas[i][j];
            }
            float media = acum / notas[i].length;

            System.out.println("Notas do "+(i+1)+"º Aluno! "+media);

        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int j = 0; j < notas[0].length; j++) { // prova only
            float acum = 0;
            for (int i = 0; i < notas.length; i++) {
                acum += notas[i][j];
            }
            float m = acum/ notas.length;
            System.out.println("Notas do "+(j+1)+"º Prova! "+m);
        }

    }
}