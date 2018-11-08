import java.util.Scanner;
public class ForLoopsOne {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = keyboard.nextInt();
        for (int count = 0; count < number; count++) {
            System.out.println(count);
        }
        for(int minusCounter=number; minusCounter>=0; minusCounter--) {
            System.out.println(minusCounter);
        }
    }
}
