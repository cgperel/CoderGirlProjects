import java.util.Scanner;
public class ThankYouMailMergeRunsCorrectly {
    public static void main(String[] args){
        System.out.println("---Thank you letter---");

        boolean keepGoing = true;
        Scanner keyboard = new Scanner(System.in);
        String donation = "";
        String name = "";

        while(!name.equals("quit") && !name.equals("quit")){
            System.out.println("Please enter a name.");
            name = keyboard.nextLine();
            if(!name.equals("quit")){
                System.out.println("Please enter a donation amount:");
                donation = keyboard.nextLine();
                if(!donation.equals("quit")){
                    System.out.println("Dear " + name+ ", \n" +
                            " \n" +
                            "Thank you for your donation!  We rely on donors like you to keep our organization effective, and" +
                            "you came through for us.  Your donation of $" + donation + " will help our efforts to make a" +
                            "difference in the world. \n" +
                            " \n" +
                            "As you may know, we are a registered non-profit organization, so your donation is tax" +
                            "deductible.  You may use this letter as a receipt for tax purposes. \n" +
                            " \n" +
                            "Thank you again for your support! \n" +
                            " \n" +
                            "Sincerely, Paula Jones YourCharity.org");
                }



            }
        }
    }

}
