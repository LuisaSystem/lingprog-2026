import java.util.Objects;
import java.util.Scanner;

public class LoginEsenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        //permissão
        int conde = 0;
        while (conde <= 2){
            // Colocar senha e usuário
            System.out.println("Coloque seu nome de usuário: ");
            String nome = ler.nextLine();
            System.out.println("=============================");
            System.out.println("Coloque uma senha: ");
            String senha = ler.nextLine();
            if (Objects.equals(senha, nome)){
                System.out.println("A senha está igual ao seu nome de Usuário! Mude imediatamente!");
                continue;
            }
            conde++;
            break;
        }
    }
}
