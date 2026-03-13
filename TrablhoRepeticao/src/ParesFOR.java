import java.util.Scanner;

public class ParesFOR {
    public static void main(String[] args) {
        Scanner tea = new Scanner(System.in);

        // nºs ler
        System.out.println("Coloque o primeiro número inferior: ");
        int num = tea.nextInt();
        System.out.println("===========================");
        System.out.println("Coloque o segundo número superior: ");
        int num2 = tea.nextInt();

        // achar os pares ENTRE INTERVALOS
        int jota = 0;
        for (int i=num; i<=num2; i++){
            if (jota%2 == 0){
                System.out.println("São pares! -- "+jota);
            }
            jota++;
        }

    }
}
