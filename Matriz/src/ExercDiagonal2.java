import java.util.Scanner;

public class ExercDiagonal2 {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Coloque números: ");
        int n = no.nextInt();

       // int n = (int) (Math.random() * 6);
        int [][] tab = new int[n][n];

        int num = 0;
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length; j++) {

                tab[i][j] = (int) (Math.random() *  10) + 10;

                if (i + j == tab.length - 1){
                    System.out.println("Elementos da matriz 4x4 ---- "+tab[i][j]);
                    num+=tab[i][j];
                }
            }

        }
        System.out.println("");
        System.out.println("Soma da Diagonal 2: "+num+"!");
    }
}
