import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner va = new Scanner(System.in);

        int num = 0;
        int p = 0;
        while (p<=9){
            // pedido simples
            System.out.println("Coloque um número: ");
            int y = va.nextInt();
            // condicao
            if (y < 0){
                System.out.println("Não! Tente novamente :3");
                continue;
            }
            p++;
            num += y;
        }
        int res = num;
        System.out.println("espero que você tenha aprendido a lição!\n"+"Aqui seu número: "+res);
    }
}
