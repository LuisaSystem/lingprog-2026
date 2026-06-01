import java.io.*;
public class quinto {
    public static void main(String[] args) {
        try (BufferedReader br = new

BufferedReader(new

        FileReader("alunos.txt"))) {

            String linha;

            while ((linha = br.readLine())

!= null) {

                System.out.println(linha);

            }

        } catch (IOException e) {

            e.printStackTrace(); }
    }
}
