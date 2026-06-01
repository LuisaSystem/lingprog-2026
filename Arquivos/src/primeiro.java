import java.io.File;
import java.io.IOException;

public class primeiro{
    public static void main(String[] args){
        // Trabalhando com File
        File f = new File("dados.txt");

        if (f.exists()) {
            System.out.println("Existe!");
            System.out.println(f.length() + " bytes");
        } else {
            try {
                f.createNewFile();
                System.out.println("Criado!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
// Saída esperada (se não existir):

// Criado!
 }
}
