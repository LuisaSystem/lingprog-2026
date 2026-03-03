import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Calculadoras {
    public static void main(String[] args){
        Scanner fi = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float n1 = fi.nextFloat();
        System.out.println("Digite outro número:");
        float n2 = fi.nextFloat();


        System.out.println("Coloque o operador: +, -, *, /");
        String op = fi.next();

        float resulta = 0;
        switch(op){
            case "+": resulta = n1 + n2; break;
            case "-": resulta = n1 - n2; break;
            case "*": resulta = n1 * n2; break;
            case "/": resulta = n1 / n2; break;
            default:
                System.out.println("Operador inválido!");return;
        }
        System.out.println("Resultado? "+ resulta);
    }
}
