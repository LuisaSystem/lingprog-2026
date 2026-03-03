import java.util.Scanner;

public class Swicth{
    public void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1.Cadastro; 2.Consulta; 3.Sair?");

        int opcao = ler.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Cadastro feito com sucesso!");
                break;
            case 2:
                System.out.println("Consulta feito com sucesso!");
                break;
            case 3:
                System.out.println("Até a próxima!");
                break;
            default:
                System.out.println("Não há essa opção!");
        }
    }
}