import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Informe a taxa de juros que deseja calcular:");
        float porcen = number.nextFloat();
        System.out.println("Coloque o seu depósito inicial: R$");
        float conta = number.nextFloat();
        System.out.println("==================================");

        float total = 0;
        for (int i=1; i<=12; i++){
            total = conta * porcen;
        }

        System.out.println("Resultado do saldo em 12 meses ------- R$"+total);

    }
}
