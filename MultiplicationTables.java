import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args){
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How Large would you like to see them?");
        Scanner keyboard = new Scanner(System.in);
        int limit = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        limit = keyboard.nextInt();
        for(firstNumber=0; firstNumber<=limit; firstNumber++)
        {
            firstNumber *=1;
            for(secondNumber=0; secondNumber<= limit;secondNumber++)
            {
                System.out.println(firstNumber+"*"+secondNumber+"="+firstNumber*secondNumber);
            }
        }
    }
}