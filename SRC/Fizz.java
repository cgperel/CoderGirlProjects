public class Fizz {
    public static void main(String[] args){
        int count = 1;
        System.out.println("Let's count to 100 fizz buzz...");

        while (count <=99){ // need 4 if statements to check so doesn't print a number and a fizz or buzz or fizzbuzz

            if (count % 3 == 0){
                System.out.println("Fizz");
            }
            if(count % 5 == 0){
                System.out.println("Buzz");
            }
            if (count % 3 == 0 && count % 5 == 0){
                System.out.println("FizzBuzz");
            }
            if(count % 3 != 0 && count % 5 != 0)
                System.out.println(count = count +1);
        }
    }
}
