import static java.lang.System.out;
import java.util.Scanner;

public class CatAndMouse
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("You are a small, hungry field mouse.  You find yourself standing in a mouse hole \nin the " +
                        "kitchen of a farm house. In the room is a bowl of cat food that smells really tasty. \nA " +
                        "young cat is sleeping on a rug in the middle of the room. Looking around the room, \n" +
                        "you see a wooden table with chairs, a metal floor lamp, and curtains over a window. \n" +
                        "You can smell a summer breeze blowing in.\n");
        out.println("Where do you go? Options: chair table lamp food curtain");
                String firstPlace = keyboard.nextLine();
                    if (firstPlace.equals("chair"))
                    {
                        out.print("You sneak quietly to the chair and climb its rough wood.  The only place \nyou " +
                        "can reach from here is the table, so you climb it too.  Looking around  \n" +
                        "from the table, you see two paths.  You can walk across the countertop  \n" +
                        "to the open window, or you can climb down the table leg to the floor. \n" +
                        "\nWhere do you go?  Options: window floor ");
                    }
                    {
                        String secondPlace = keyboard.nextLine();
                            if (secondPlace.equals("window"))
                            {
                            out.println("\nYou climb out the window and down.  The tall grass hides you well. " +
                            "You find some tasty \nspilled grain. By the time you get to the barn, you are well fed, " +
                            "and ready to take a \nnap in the hay.  There is no cat in the barn. You're a " +
                            "happy mouse. (The End)");
                            out.println("You win!");
                            }
                            if (secondPlace.equals("floor"))
                            {
                            out.println("\nYou try to climb down the table leg but it's too slippery. Thump! "
                            + "You hit\nthe floor with a bang. The cat wakes up and chases you around the kitchen! " +
                            " \nYou race back to your hole, still hungry, and hide for the rest of the " +
                            "\nday. (The End) ");
                            out.println("Try again later.");
                            }
                    }
                    if(firstPlace.equals("table"))
                    {
                    out.println("You sneak quietly to the table. The legs are polished and slippery, and you \n" +
                    "fall with a thump when you try to climb up. The cat woke up! He chases you around \n" +
                    "the kitchen and back into the mouse hole!  Exhausted and hungry, you give up for \n" +
                    "the day.  (The End) ");
                    out.println("Try again later.");
                    }
                    if(firstPlace.equals("lamp"))
                    {
                     out.println("You sneak quietly over to the lamp and try to climb it.  The lamp buzzes slightly " +
                     "\nunder your paws, and the light turns on with a click!  The cat heard the lamp turn on and " +
                     "\nsnaps awake.  He chases you around the kitchen and back into your hole!  (The End) \n");
                     out.println("Try again later.");
                    }
                    if(firstPlace.equals("food"))
                    {
                        out.println("You sneak over to the cat's food dish. There's one piece of food on the floor\n" +
                                "and more in the dish. You're very hungry." +
                                " \n" +
                                "What do you eat?  Options: floor dish ");
                                    String thirdPlace = keyboard.nextLine();
                                        if(thirdPlace.equals("floor"))
                                        {
                                            out.println("You eat a large, tasty piece of cat food that was dropped " +
                                                    "on the floor.\nYou were very quiet.  The cat hasn't woken up " +
                                                    "yet. \n" +
                                                    " \n" +
                                                    "Where do you go next?  Options: dish curtain ");
                                                        String fourthPlace = keyboard.nextLine();
                                                            if (fourthPlace.equals("dish"))
                                                            {
                                                             out.println("The cat food rattles loudly as you climb " +
                                                             "into the cat food dish.\nThe cat wakes up!  And he " +
                                                             "knows exactly where you are.  He's on you\nin an " +
                                                             "instant!  You are lunch. :(\nWe'll be sure to notify " +
                                                             "your next of kin.  (The End) ");
                                                             out.println("The world's tiniest sad trombone plays at " +
                                                                     "your mouse funeral.");
                                                            }
                                                            if (fourthPlace.equals("curtain"))
                                                            {
                                                            out.println("You quietly sneak over to the curtain.  The" +
                                                            "cat wakes up slow and groggy.  You've already made it" +
                                                            "to the curtain by the time he notices you.  With a" +
                                                            "burst of well-fed strength, you race up the curtain and" +
                                                            "leap out the open window!  Behind you, you hear the" +
                                                            "thump of the cat hitting the window frame and not making" +
                                                            "it through. \n" +
                                                            " \n" +
                                                            "You follow a grain trail to the barn and find some warm" +
                                                            "hay to hide in for a nap.  There is no cat in the barn." +
                                                            "You're a happy mouse!  (The End) ");
                                                            out.println("You win!");
                                                            }
                                        }
                                        if(thirdPlace.equals("dish"))
                                        {
                                        out.println("The cat food rattles loudly as you climb into the cat food dish." +
                                        " The cat wakes up!\nAnd he knows exactly where you are.  He's on you in an" +
                                        "instant!  You are lunch. :(\nWe'll be sure to notify your next of kin." +
                                        "(The End) ");
                                        out.println("The world's tiniest sad trombone plays at your mouse funeral");
                                        }
                    if(firstPlace.equals("curtain"))
                    {
                    out.println("You sneak quietly across the room to the long curtains hanging by the window. " +
                    "The curtains are an easy climb.  The cat is still asleep.  You smell a barn just outside. " +
                    " \n" +
                    "Where do you go? Options: down window");

                        String fifthPlace = keyboard.nextLine();
                        if (fifthPlace.equals("down"))
                        {
                        out.println("As you climb back down the curtain, the cat stretches and looks around the room." +
                        "He notices the curtain hanging strangely and comes over to investigate.  You have barely a" +
                        "moment to race back into your hole and try again tomorrow.  (The End) ");
                        out.println("Try again later.");
                        }
                        if (fifthPlace.equals("window"))
                        {
                        out.println("You smell a barn nearby with fresh grain.  You climb through the window and " +
                        "hide in the tall grass.  There's spilled grain here that makes a tasty treat.  By the time" +
                        "you reach the barn, you are well fed, and find a quiet spot in the hay for a nap.  There" +
                        "is no cat in the barn.  You're a happy mouse! (The End) ");
                        out.println("You win!");
                        }
                    }
                    }
    }
}
