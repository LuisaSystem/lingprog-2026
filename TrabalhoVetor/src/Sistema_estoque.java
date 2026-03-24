import java.util.Scanner;

public class Sistema_estoque {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         // cada definição dos vetores

        int [] qtd = new int[5];
        String [] prod = new String[5];
        
        // lendo o que oo usuario tem
        for (int i = 0; i < prod.length; i++) {
            System.out.println("Coloque o número do produto");
            prod[i] = ler.next();

            System.out.println("Agora, com a quantidade: ");
            qtd[i] = ler.nextInt();
        }

        // limitando os componentes

        boolean critico = true;

        for (int i = 0; i < qtd.length; i++) {
            if (qtd[i] == 5) {
                System.out.println("Quantidade em estado CRÍTICO! Reestoque em: "+qtd[i]+" no "+prod[i]);
                critico = true;
            }

            if (!critico){
                System.out.println("Tudo em ordem!");
            }

        }
    }
}
