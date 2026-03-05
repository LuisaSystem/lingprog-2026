import java.util.Scanner;

public class Cardapio{
    static public void main(String[] args){
        Scanner ye = new Scanner(System.in);

        // cardapio

        System.out.println("Insira os codigos a seguir: ");
        System.out.println("101 - cachorro quente -- R$10\n 102- X-burguer -- R$15\n 103 - X-salada -- R$12; ");
        int op = ye.nextInt();

        float preco = 0;
        switch(op){
            case 101:
                preco = 10f;
                break;
            case 102:
                preco = 15f;
                break;
            case 103:
                preco = 12f;
                break;
            default:
                System.out.println("Produto inválido!"); return;
        }
        
        // quem vai comprar
        System.out.println("Informe sua idade: ");
        int ano = ye.nextInt();

        float conta = 0;
        String mess ="";
       
        if (ano <= 12){
            mess = "Menu Kids! :3";
            conta = preco * 0.5f;
        } else if (ano > 12 && ano <= 60) {
            mess = "Valor Integral";
            conta = preco;
        } else if (ano > 60) {
            mess = "Melhor Idade";
            conta = preco * 0.3f;
        }else {
            mess = "---- Desconto não identificado ----";
        }

        System.out.println("O seu pedido é "+ op +" e sua idade é "+ano+" a desconto: "+mess+" ---- R$"+conta+"!");



    }
}