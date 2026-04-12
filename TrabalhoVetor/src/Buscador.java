
import java.util.Scanner;

// ~ PRIMEIRO IMAGRECIMENTO ~

public class Buscador {
    //func1 e 2.
    public static void buscarNome(String [] nome){

        // processo de colocar o nome
        Scanner ter = new Scanner(System.in);
        for (int i = 0; i < nome.length ; i++) {
            System.out.println("Digite nomes par a sua pesquisa: ");
            nome[i] = ter.next();
        }

        // processo de buscar o nome
        System.out.println("O que deseja pesquisar?");
        String pes = ter.next();
        boolean encontrado = false;

        for (int i = 0; i < nome.length; i++) {
            if (nome[i].equalsIgnoreCase(pes)){
                System.out.println("-----------------------------------------------------");
                System.out.println("O seu nome de pesquisa "+nome[i]+" foi encontrado na posição "+i+"!");
                System.out.println("-----------------------------------------------------");
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("Pesquisa não encontrada!");
        }
    }
    public static void main(String[] args) {
        String [] nome =  new String[5];
        buscarNome(nome);
    }
}
