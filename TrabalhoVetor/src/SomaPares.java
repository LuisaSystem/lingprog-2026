import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        int soma = 0;
        int [] num = new int[8];
        for(int i=0; i< num.length; i++){
            System.out.println("Digite 8 núemros para serem somados: ");
            num[i] = o.nextInt();

            // a lógica estava certa, mas colocado nos lugares errados
            if (num[i]%2 == 0){
                soma+=num[i];
            }
        }

        System.out.println("================================");
        System.out.println("Resultado de sua soma: "+soma);
        System.out.println("================================");

    }
}
