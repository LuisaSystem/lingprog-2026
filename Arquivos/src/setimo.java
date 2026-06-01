import java.io.*;
public class setimo {
    public static void main(String[] args) {

        try(PrintWriter log = new PrintWriter(new FileWriter("log.txt", true))){
            log.println("Conexão realizada em " + new java.util.Date());
        }catch (IOException e){

        }
    }
}
