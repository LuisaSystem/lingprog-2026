import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        int soma = 0;
        int [] num = new int[8];
        for(int i=0; i<8; i++){
            System.out.println("Digite 8 núemros para serem somados: ");
            num[i] = o.nextInt();
            soma += num[i];
        }
        if (soma%2 ==0){
            System.out.println("Seu resultado: "+soma);
        }else{
            System.out.println("Nenhum resultado feito ainda...");
        }

    }
}
