import java.util.Scanner;

public class ForLoopsTwoManyBarChart
{
    public static void main(String[] args)
    {
        int times;
        System.out.print("Welcome to Bar Chart");

        do{
            System.out.println("\nnumber?");
            Scanner keyboard = new Scanner(System.in);
            times = keyboard.nextInt();
            barChart(times);
        } while(times !=0);//if someone enters 0, it will end
        System.out.println("");
        System.out.println("Have a good day!");

        for(int i = 0; i < times; i++)
        {
            System.out.print("#");
        }
    }
    public static void barChart(int times){
        for(int i = 0; i< times; i++)
        {
            System.out.print("#");
        }
    }
}