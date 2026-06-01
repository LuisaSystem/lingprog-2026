import java.io.*;

public class sexto {
    public static void main(String[] args) {
        try (PrintWriter pw = new

                PrintWriter("relatorio.txt")) {



            pw.println("=== Relatório de Notas ===");

            pw.println();



            String[] alunos = {"Ana","Bruno","Carla"};

            double[] notas = {8.5, 7.0, 9.2};



            for (int i = 0; i < alunos.length; i++) {

                pw.printf("%-10s %.1f%n",

                        alunos[i], notas[i]);

            }



        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
