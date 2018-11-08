import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args) {
        //call both methods
        //if want user input could put scanner here better to do here so could change what you want to do when run method
        sayHi("Doug", "Jenny", "Pearl");
        String dog = "Howard";
        sayHi(dog, "Norman", "Franklin");
        int min = findMin(2,3);
        System.out.println(min);
        min = findMin(7,5);
        System.out.println(min);
    }

    //write two both methods
    public static void sayHi(String name1, String name2, String name3){
    //name it an action and in parantheses is parameters
        System.out.println("Hello, "+name1 +", "+name2 +" and "+name3); //plus is incatination
}

//find smaller int
public static int findMin (int value1, int value2){
        //if want user input could put scanner here
    if(value1 < value2){
        return value1; //obligated to use return because says int, in ex above says void so no return
    } else {
        return value2;
        }
    }
}

