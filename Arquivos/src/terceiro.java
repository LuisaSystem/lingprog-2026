import java.io.FileReader;

import java.io.IOException;
public class terceiro {
     public static void main(String[] args) {
        try {
            FileReader fr = new
                    FileReader("notas.txt");
            int c;
            while ((c = fr.read()) != -1){
                System.out.println((char) c);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}
