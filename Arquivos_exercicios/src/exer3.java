import java.io.*;
import java.util.Scanner;

//intermediário
public class exer3 {
    public static void main(String[] args) {
        Scanner escr = new Scanner(System.in);

        System.out.println("Como foi seu dia: ");
        String leu = escr.next();

        try (PrintWriter log = new PrintWriter(new FileWriter("diario.txt", true))){
            log.println(leu + new java.util.Date());
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
