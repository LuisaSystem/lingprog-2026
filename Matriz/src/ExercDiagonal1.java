import java.util.Scanner;

public class ExercDiagonal1 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);

        int [][] tab = new int[4][4];

        int num = 0;
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                //System.out.println("Coloque números: ");
                tab[i][j] = (int) (Math.random() *10)+10;

                if (i == j){
                    System.out.println("Elementos da matriz 4x4 ---- "+tab[i][j]);
                    num+=tab[i][j];
                }
            }

        }
        System.out.println("");
        System.out.println("Soma da Diagonal 1: "+num+"!");
    }
}
