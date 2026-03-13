import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner ok = new Scanner(System.in);

        // pedindo os numeros
        System.out.println("Digite um número para multiplicar: ");
        int num = ok.nextInt();
        System.out.println("---------Tabuada do "+num+"---------");

        // processo dos dados
        int cont = 0;
        for (int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+ num*i);
            cont++;
        }
        System.out.println("-----------------------------------");
    }
}
