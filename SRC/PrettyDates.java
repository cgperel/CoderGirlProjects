public class PrettyDates {
    //---add methods here to make the program work ---
    // formatNumber as TwoDigits -pad single number with 0 to make double digit
    public static String formatNumberAsTwoDigits(int number) {
        if (number < 10) {
            return "0" + number;
        } else {
            return "" + number; //empty string because can't change int to string
        }

    }

    //nameFormat Name of month
    public static String nameFormat(int year, int month, int day) {
        String monthName = " ";
        if (month == 1) {
            monthName = "January";
        } else if (month == 2) {
            monthName = "February";
        } else if (month == 3) {
            monthName = "March";
        } else if (month == 4) {
            monthName = "April";
        } else if (month == 5) {
            monthName = "May";
        } else if (month == 6) {
            monthName = "June";
        } else if (month == 7) {
            monthName = "July";
        } else if (month == 8) {
            monthName = "August";
        } else if (month == 9) {
            monthName = "September";
        } else if (month == 10) {
            monthName = "October";
        } else if (month == 11) {
            monthName = "November";
        } else if (month == 12) {
            monthName = "December";
        }
        return monthName + " " + day + ", " + year;
        }

        //slashFormat mm/dd/yyyy
        public static String slashFormat(int year, int month, int day)
        {
            String monthStr = formatNumberAsTwoDigits(month);
            String dayStr = formatNumberAsTwoDigits(day);
            return monthStr + "/" + dayStr + "/" + year;

        }

        //dashFormat mm-dd-yyyy
        public static String dashFormat(int year, int month, int day)
        {
//same as slash but just do dash instead of slash
            String monthStr = formatNumberAsTwoDigits(month);
            String dayStr = formatNumberAsTwoDigits(day);
            return monthStr + "-" + dayStr + "-" + year;
        }
        //---end of your work area----

        //Don't change this code
        public static void printDate(int year, int month, int day)
        {
            System.out.println(nameFormat(year, month, day));
            System.out.println(slashFormat(year, month, day));
            System.out.println(dashFormat(year, month, day));
            System.out.println();
        }

        //DOn't change this code
        public static void main(String[] args)
        {
            System.out.println(formatNumberAsTwoDigits(3));
            System.out.println(formatNumberAsTwoDigits(9));
            System.out.println(formatNumberAsTwoDigits(10));
            System.out.println(formatNumberAsTwoDigits(12));

            printDate(2014, 10, 4);
            printDate(2015, 1, 1);
            printDate(2013, 12, 31);
        }
    }
