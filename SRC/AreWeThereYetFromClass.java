import java.util.Scanner;

public class AreWeThereYetFromClass {
    public static void main(String[] args) {

        boolean keepGoing = true;  //if true keep going if not then we stop
        while (keepGoing) {
            System.out.println("Are we there yet?"); //needs to be inside loop so does again

            Scanner keyboard = new Scanner(System.in);
            String response = keyboard.nextLine(); // if stopped here it would never stop because never told it to do anything different, have to make boolean false at some point- job of programmer

            if (response.equals("yes")) { //dont use == for string
                keepGoing = false;
                //can put we are here right here but more intuitive outside the loop

            } else if(!response.equals("no")) //only need to check if says no because already checks yes on line 13
            { System.out.println("Huh? I don't understand that!");}
        }
        System.out.println("Yay!");
    }
}
//people struggle alot with what goes inside and what goes outside