import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class exer4 {
    public static void salvarNotas(String nome, double notas, String situa) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("NotasDosAlunos.txt", true))){
            pw.println(nome + "," + notas + "," + situa);
        }
    }
    public static  void listarNotas() throws IOException{
        try (Scanner sc = new Scanner(new File("NotaAluno.txt"))) {
            while (sc.hasNextLine()) {
                String[] partes = sc.nextLine().split(",");
                System.out.printf("Nome: %-20s Notas: %.2f Situação atual: %-15s", partes[0], partes[1]);
            }
        }
    }
    public static void main(String[] args) {
        try{
            salvarNotas("Nicole Silva", 2.78,"Reprovado");
            salvarNotas("iudgwhbwueduhaw", 9.00,"Aprovado");
            salvarNotas("Augostinho Cah", 4.90,"Reprovado");

            System.out.println("=== Notas dos alunos ===");
            listarNotas();

        } catch (IOException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}
