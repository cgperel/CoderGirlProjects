import static java.lang.System.out;
import java.util.Scanner;

public class Apple
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int appleCount;
        out.print("How many apples?");
        appleCount = keyboard.nextInt();

        int appleCostsInCents;
        out.print("How many cents each?");
        appleCostsInCents = keyboard.nextInt();

        int priceInCents = appleCount + appleCostsInCents;
        float priceInDollars = priceInCents / 100f;
        out.println("The order price is " + priceInDollars + " dollars. ");
        out.println("The order price is " + priceInCents + " cents. ");
    }
}
