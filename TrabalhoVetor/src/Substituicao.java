import java.util.Scanner;

// ~ NONO EMAGRECIMENTO ~

//acertei além do corrigir
public class Substituicao {
    public  static void subEngine(int[] number){
        Scanner p = new Scanner(System.in);

        for (int i=0; i< number.length; i++){
            System.out.println("Coloque 10 números a serem substituidos ocultamente: ");
            number[i]= p.nextInt();
            // verificação de negativos
            if (number[i] < 0){
                number[i] = 0;
            }
        }

        //resultado
        System.out.println("Resultado: ");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]+"  ");
        }
    }
    public static void main(String[] args) {
        // processo

        int [] number = new int[10];
        subEngine(number);
    }
}
