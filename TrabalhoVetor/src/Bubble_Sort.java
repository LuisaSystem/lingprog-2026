import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner ter = new Scanner(System.in);

        int [] number = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Bubble sort :3 -> digite 5 números: ");
            number[i] = ter.nextInt();
            for (int j = 0; j < i; j++) {
                if (number[i] > 0 && number[i] < 10){
                    j = number.length;
                    System.out.println(number[j+1]+"  ");
                }

            }
        }
    }
}
