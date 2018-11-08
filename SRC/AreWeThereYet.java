import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String weAreThere = "";
        boolean keepGoing = true;

        System.out.println("We are going on a trip!");
        while (keepGoing == true) {
            System.out.println("Are we there yet? Enter y or n.");
            weAreThere = keyboard.nextLine();
            if (weAreThere.equals("y")) {
                keepGoing = false;
            }else if(!weAreThere.equals("n"))
            {
                System.out.println("Huh! I don't understand that!");
            }
        }
        System.out.println("We are there!");
    }
}
