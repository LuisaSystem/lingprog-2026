import java.util.Scanner;

public class Sistema_estoque {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         // cada definição dos vetores

        int [] qtd = new int[5];
        String [] prod = new String[5];
        
        // lendo o que oo usuario tem
        for (int i = 0; i < 5; i++) {
            System.out.println("Coloque o número do produto");
            prod[i] = ler.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Finaliznado com a quantidade: ");
            qtd[i] = ler.nextInt();
        }
        // limitando os componentes

        prod[0] = "";
        qtd[0] = 5;

        for (int i = 0; i < qtd.length; i++) {
            if (qtd[i] == 5) {
                System.out.println("Quantidade Equilibrado");
            }else if (qtd[i] < 5){
                System.out.println("Quantidade em estado CRÍTICO! Reestoque mais!");
            }
        }
    }
}
