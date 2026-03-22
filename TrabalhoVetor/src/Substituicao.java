import java.util.Scanner;

public class Substituicao {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        // processo
        int sub = 0;
        int [] number = new int[10];
        for (int i=0; i<10; i++){
            System.out.println("Coloque 10 números a serem substituido ocultamente: ");
            number[i]= p.nextInt();
            sub+=number[i];
            if (sub < 0){
                sub = 0;
            }
        }

        //resultado
        System.out.println("Resultado: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(sub+"  ");
        }


    }
}
