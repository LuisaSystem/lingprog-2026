import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Buscador {
    public static void main(String[] args) {
        Scanner ter = new Scanner(System.in);

        String [] nome =  new String[10];

        // processo de colocar o nome
        String pes;
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Digite nomes par a sua pesquisa: ");
            nome[i] = ter.next();
            pes = nome[i];
            // processo de buscar o nome
            do {
                System.out.println("O que deseja pesquisar?");
                pes = ter.next();
            }while(pes.equals(nome[i]));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("O seu nome de pesquisa foi:  "+Arrays.asList(nome)+"!");
        System.out.println("-----------------------------------------------------");




        /*while (nome.length < 10){
            System.out.println("O que deseja pesquisar?");

        }*/
    }
}
