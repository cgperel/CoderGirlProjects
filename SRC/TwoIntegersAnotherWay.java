import java.util.Scanner;
import static java.lang.System.out;

public class TwoIntegersAnotherWay {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type in the first value:");
        int first = keyboard.nextInt();
        System.out.println("Type in the second value:");
        int second = keyboard.nextInt();

        if (first > second){
            System.out.println(first);
            System.out.println(second);
        }
        if (second > first) {
            System.out.println(second);
            System.out.println(first);
        }
        if (first == second) {
            System.out.println("They are equal.");
        }

    }
}
