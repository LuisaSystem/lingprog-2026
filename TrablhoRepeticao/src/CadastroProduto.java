import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float total = 0;
        int cond = 0;
        while(cond <= 6){
            System.out.println("Cadastre produtos da conveniência: ");
            String cad = ler.nextLine();
            System.out.println("Coloque o seu preço: R$");
            float cade = ler.nextFloat();
            System.out.println("===================================");

             if(cade < 0 || cade > 100){
                   System.out.println("Deseja continuar sua listagem? (S/N)?");
                   String fim = ler.nextLine();
                    break;
             }
            total = cond+cade;
            cond++;
        }

        System.out.println("O resultado do lucro é ======== R$"+total);



    }
}
