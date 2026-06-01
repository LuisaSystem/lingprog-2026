import java.io.FileWriter;
import java.io.IOException;
public class segundo {
    public static void main(String[] args){
        try {
            FileWriter fw = new
            FileWriter("notas.txt");
            fw.write("Ana: 8.5\n");
            fw.write("Bruno: 7.0\n");
            fw.close();
            System.out.println("Salvo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
