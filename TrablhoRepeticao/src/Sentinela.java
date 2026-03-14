import java.util.Scanner;

public class Sentinela {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cod = 0;
        float soma = 0;

         while(cod <= 10){
             System.out.println("Coloque a sua idade: ");
             int idade = ler.nextInt();
             if (idade < 0){
                 System.out.println("medias seguintes! -----");
                 break;
             }
             cod++;
             soma += idade;
         }
         float media =  soma/cod;
        System.out.println("A média das idades: "+media);
    }
}
