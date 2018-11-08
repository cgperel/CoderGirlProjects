import java.util.Scanner;

public class Validator
{
    public static int getIntegerBetween(int lower, int upper) //having lower and upper without numbers here allows you to change it
    {
        //TO-DO
        Scanner keyboard = new Scanner(System.in);
        int input;
        do {
            input = keyboard.nextInt();
            if (input < lower || input > upper){
                System.out.println("Invalid, please enter a number between " + lower +" and " +upper + ".");
            }
        } //do while so catches every time number is over 1 and under 10
        while (input < lower || input > upper);// if not valid then this will do it again
            return input;
    }

   public static int getTensInteger(int lower, int upper)
    {
        //TO-DO
        Scanner keyboard = new Scanner(System.in);
        int input;
        do {
            input = keyboard.nextInt();
            if (input < lower || input > upper || input % 10 != 0){
                System.out.println("Invalid, please enter a number between " + lower + " and " + upper + " and is a multiple of 10");
            }
        } //do while so catches every time number is over 1 and under 10
        while (input < lower || input > upper||input % 10 != 0);
            return input;
    }

    public static void main(String[] args)
    {
        System.out.println("Please enter a number from 1-10.");
        int firstNumber = getIntegerBetween(1, 10);

        System.out.println("Please enter a number between 200 and 3000 that is a multiple of ten. ");
        int secondNumber = getTensInteger(200, 3000);

        System.out.println("You entered " + firstNumber + " and " + secondNumber);
    }
}
