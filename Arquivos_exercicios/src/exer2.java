import java.io.*;
//easymode
public class exer2 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new
                    FileWriter("compras.txt");
            fw.write("1.Arroz\n");
            fw.write("2.Feijão\n");
            fw.write("3. Macarrão\n");
            fw.write("4. Óleo\n");
            fw.write("5. Sal\n");
            fw.close();
        System.out.println("Salvo!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new
                    FileReader("compras.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
