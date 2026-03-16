import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float saldo = 0;
        int opcao = 0;
        do {
            System.out.println("Digite uma das opções: \n 1.Consultar \n 2.Depositar \n 3.Sacar \n 4.sair");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saldo atual da conta: R$"+saldo);break;
                case 2:
                    System.out.println("Informe o valor do depósito --- ");
                    float valor = ler.nextFloat();
                    saldo +=valor ;break;
                case 3:
                    System.out.println("Qual valor que desejar sacar?");
                    valor = ler.nextFloat();
                     if (valor <= saldo){
                         saldo -= valor;
                         System.out.println("Saque sucedido!");
                     }else System.out.println("Valor insuficiente!!");break;
                case 4:
                    System.out.println("Programa Finalizado ...");
                    break;
                default:
                    System.out.println("Não exite essa opção!");
            }
        }while (opcao != 4);
    }
}
