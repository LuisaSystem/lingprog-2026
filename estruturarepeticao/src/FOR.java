import java.util.Scanner;

public class FOR {
    public static void main(String[] args){
        // informa QNTD de vezes :3
        Scanner bah = new Scanner(System.in);

        System.out.println("Informe a quantidade de vezes que vai ser sua repetição: ");
        int qtd = bah.nextInt();
        // Informar o acerto

        System.out.println("Qual o número que você quer ganhar? ");
        int num = bah.nextInt();
        int resul = 0;

        while(num > 1 || num > 6){
            System.out.println("Número deve ser entre 1 e 6!");
            bah.nextInt();
        }

        for (int i = 1; i <= qtd ; i++){
             int ui = (int) (Math.random()*6+1);
            System.out.println("===> "+ui);
            if (ui == num){
                resul++;
            }
        }

        System.out.println("------------------");
        System.out.println("Você acertou: " +resul);
        System.out.println("acertou "+ ((float)resul / qtd)*100+"%");
    }
}
