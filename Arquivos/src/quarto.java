import java.io.*;

public class quarto {
    public static void main(String[] args) {
        try (BufferedWriter bw = new
                BufferedWriter(new FileWriter("Alunos.txt"))) {
            bw.write("Ana, 8.5");
            bw.newLine();
            bw.write("Bruno, 7.0");
            bw.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
