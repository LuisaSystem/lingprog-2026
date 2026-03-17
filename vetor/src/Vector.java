import java.util.Scanner;

public class Vector {
    public static void main() {
        Scanner k = new Scanner(System.in);
        float soma = 0;
        float[] notas = new float[5];

        for (int i=0; i<5; i++){
            System.out.println("Coloque a "+(i+1)+"ª nota");
            notas[i] = k.nextFloat();
            soma+=notas[i];
        }
        System.out.println("Média: "+soma/5);

    }
}