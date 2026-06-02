import java.io.*;
//easymode
public class exer1 {
    public static void main() {
        File f = new File("Recados!");

        if (f.exists()) {
            System.out.println("Existe!");
            System.out.println(f.length() + " bytes");
        }else{
            try {
                f.createNewFile();
                System.out.println("Arquivo criado com sucesso!");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}


