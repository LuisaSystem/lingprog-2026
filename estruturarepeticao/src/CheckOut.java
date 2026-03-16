import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // nome e valor do cliente
        System.out.println("Insira o nome do Cliente: ");
        String nome = leia.nextLine();
        System.out.println("Agora, o valor bruto da compra: R$");
        float compra = leia.nextFloat();

        //---------------- processo -----------------

        int opcao = 0;
        do {
            System.out.println("Escolha a forma de pagamento a seguir: \n 1.À vista \n 2.Parcelado no cartão " +
                    "\n 3.Creditário da Loja \n 0.Cancelar venda");
            opcao = leia.nextInt();

            switch (opcao){
               case 1:
                   System.out.println("Desconto de 15% vai ser R$"+(compra-compra * 0.15f));
                   break;
               case 2:
                   System.out.println("Quantidade de parcelas [máximo 5x]");
                   int qtde = leia.nextInt();

                   for (int i=1; i<=qtde; i++){
                       System.out.println("Na"+i+"ª parcela de = R$"+(compra/qtde));
                   }
                   break;
               case 3:
                   System.out.println("2% ao mês de juros, 10 parcelas de R$"+(compra*1.20)/10);
                   break;
                case 0:
                    System.out.println("A compra de "+nome+" foi cancelada...");break;
                default:
                    System.out.println("Opção não existente!");
           }
        }while (opcao != 0);
    }
}
