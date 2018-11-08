import java.util.Scanner;
public class ForLoopsTwo {
    public static void main(String[] args){
        System.out.println("Welcome to Bar Chart");
        System.out.println("number?");
        Scanner keyboard = new Scanner(System.in);
        int width = keyboard.nextInt();
        for(int counter = 0; counter < width; counter++){//progrmamers like to start at 0
            System.out.print("#"); //if type in 0, loop won't go
        }
        System.out.println("\nHave a good day!");
    }
}

