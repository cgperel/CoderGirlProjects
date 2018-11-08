import java.util.Scanner; // only quits after running the letter one more time

public class ThankYouMailMerge {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String personName;
        String donationAmount;
        boolean keepGoing = true;

        System.out.println("Thank You Letters");
        while(keepGoing){
            System.out.println("Please enter donor's first and last name.");
            personName = keyboard.nextLine();//if quit below then does exit but after prints next letter
            if (personName.equals("quit")){
                keepGoing = false;
            }
            System.out.println("Please enter donation amount.");//his input set to receive float so error when entered $ sign, can read error and try and find things you recognice to see what you did wrong
            donationAmount = keyboard.nextLine(); //good to use double, more specific but then you have to be careful of what you enter but then quit doesn't work. will drop zero if double or float. can fix that by testing if divisible by 10
            System.out.println("Dear " + personName+ ", \n" +
                    " \n" +
                    "Thank you for your donation!  We rely on donors like you to keep our organization effective, and" +
                    "you came through for us.  Your donation of $" + donationAmount + " will help our efforts to make a" +
                    "difference in the world. \n" +
                    " \n" +
                    "As you may know, we are a registered non-profit organization, so your donation is tax" +
                    "deductible.  You may use this letter as a receipt for tax purposes. \n" +
                    " \n" +
                    "Thank you again for your support! \n" +
                    " \n" +
                    "Sincerely, Paula Jones YourCharity.org");
            }
        System.out.println("Mail donation letters.");
        }

    }
