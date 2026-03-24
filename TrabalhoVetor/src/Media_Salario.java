import java.util.Arrays;
import java.util.Scanner;

public class Media_Salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // 5 salarios
        double soma = 0;
        double [] sal = new double[5];

        for (int i = 0; i < sal.length; i++) {
            System.out.println("Agora, os slarios deles: R$");
            sal[i] = ler.nextDouble();
            soma+=sal[i];
        }

        double media = soma/ sal.length;

        int acima = 0, abaixo = 0, igual = 0;

        for (int i = 0; i < sal.length; i++) {
            if (sal[i] > media){
                acima++;
            } else if (sal[i] < media) {
                abaixo++;
            }else {
                igual++;
            }
        }

        // Exibição dos resultados
        System.out.println("\n--- RELATÓRIO ESTATÍSTICO ---");
        System.out.printf("Média Salarial da Empresa: R$ %.2f%n", media);
        System.out.println("Funcionários acima da média: " + acima);
        System.out.println("Funcionários abaixo da média: " + abaixo);
        System.out.println("Funcionários que ganham exatamente a média: " + igual);

    }
}
