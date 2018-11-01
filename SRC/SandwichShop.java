import java.util.Scanner;

import static java.lang.System.out;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        int veggieSandwiches = keyboard.nextInt();
        if (veggieSandwiches >= goalForVeggies) {
            out.println("Made goal for veggies.");
        } else {
            out.println("Fell short");
        }
        out.println("The sales goal for burgers is 250.");
        out.println("How many burgers were sold today?");
        int burgers = keyboard.nextInt();
        if (burgers >= goalForBurgers) {
            out.println("Made goal for burgers.");
        } else {
            out.println("Fell short");
        }
        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");
        int subs = keyboard.nextInt();
        if (subs >= goalForSubs) {
            out.println("Made goal for subs.");
        } else {
            out.println("Fell short");
        }
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        int soup = keyboard.nextInt();
        if (soup >= goalForSoup) {
            out.println("Made goal for soup");
        } else {
            out.println("Fell short");
        }
        if (veggieSandwiches >= goalForVeggies && burgers >= goalForBurgers && subs >= goalForSubs && soup >= goalForSoup)
            out.println("Made goal for everything!");
    }
}
