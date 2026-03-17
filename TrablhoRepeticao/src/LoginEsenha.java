import java.util.Objects;
import java.util.Scanner;

public class LoginEsenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        String senha;

        System.out.println("+++++++++ Cadastro do Usuário +++++++++");
        System.out.println("Coloque seu nome de usuário: ");
        nome = ler.nextLine();
        System.out.println("=============================");

        System.out.println("Coloque uma senha: ");
        senha = ler.nextLine();

        //permissão
        while (nome.equalsIgnoreCase(senha)){
            // Colocar senha e usuário
            System.out.println("A senha está igual ao seu nome de Usuário! Mude imediatamente!");
            System.out.println("Coloque seu nome de usuário: ");
            nome = ler.nextLine();
            System.out.println("=============================");
            System.out.println("Coloque uma senha: ");
            senha = ler.nextLine();
        }

        System.out.println("Seja bem-vindo, "+nome+"!");
    }
}


