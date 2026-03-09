public class Repeticao{
    public static void main(String[] args){
        int cond = 1;
        while(cond <= 10){
            System.out.println("ALlay!"+cond);
            System.out.println((int)(Math.random()*10));
            cond++;
        }
    }
}