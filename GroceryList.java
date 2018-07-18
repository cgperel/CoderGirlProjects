import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        out.println("Please list three items on your grocery shopping list");
        out.print("Item 1?");
        String Item1 = keyboard.next();

        out.print("Item 2?");
        String Item2 = keyboard.next();

        out.print("Item 3?");
        String Item3 = keyboard.next();

        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + Item1 + " ?");
        int A = keyboard.nextInt();
        keyboard.skip("\n");

        out.print("How many " + Item2 + " ?");
        int B = keyboard.nextInt();
        keyboard.skip("\n");

        out.print("How many " + Item3 + " ?");
        int C = keyboard.nextInt();
        keyboard.skip("\n");

        out.println("Now, Please enter the price of each item.");
        out.print("How much does " + Item1 + " cost?");
        float price1 = keyboard.nextFloat();
        keyboard.skip("\n");

        out.print("How much does " + Item2 + " cost?");
        float price2 = keyboard.nextFloat();
        keyboard.skip("\n");

        out.print("How much does " + Item3 + " cost?");
        float price3 = keyboard.nextFloat();
        keyboard.skip("\n");

        out.println("Calculating your grocery bill.");
        out.print("Your total cost is " + ((A*price1) + (B*price2) + (C*price3)));




    }
}
