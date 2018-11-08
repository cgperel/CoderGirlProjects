public class LeapYear {

    public static boolean isLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //2000 would be false for first and then true for second so then true also for second parantheses don't need 100 because if divisible by 400 then 100 also divisible
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("2000 is a leap year (should be true): " + isLeapYear(2000));
        System.out.println("1988 is a leap year (should be true): " + isLeapYear(1988));
        System.out.println("1900 is not a leap year (should be false): " + isLeapYear(1900));
        System.out.println("1999 is not a leap year (should be false): " + isLeapYear(1999));
    }
}
