import java.util.Scanner;
//acertei além do corrigir
public class Substituicao {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        // processo

        int [] number = new int[10];
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
}
