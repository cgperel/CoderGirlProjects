import java.util.Scanner;

public class AddingMachine {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        boolean keepGoing = true;

        System.out.println("Welcome to adding machine! \nTotal: 0");
        while (keepGoing){
            System.out.println("Add: ");
            int count = keyboard.nextInt();
            total = total + count;
            System.out.println("Total: " + total);
            counter = counter + 1;
            if (count == 0){
                keepGoing = false;
            }

        }
        System.out.println("You entered " + counter + " for a total of " + total + ".");
    }

}
