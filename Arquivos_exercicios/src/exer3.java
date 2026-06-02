import java.io.*;
import java.util.Date;
import java.util.Scanner;

//intermediário
public class exer3 {
    public static void main(String[] args) {

        try(PrintWriter pw = new PrintWriter("diario.txt")) {
            pw.println("==== Diario ====");
            pw.println();

            String[] anota = {"sabado 09/02/2026 - Hoje eu fiz algo lol"};

            for (int i = 0; i < anota.length; i++) {
                pw.printf("%-10s", anota[i]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }












        /*try (PrintWriter log = new PrintWriter(new FileWriter("diario.txt", true))){
            log.println("Cone");
        }*/


    }
}
