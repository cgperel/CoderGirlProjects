public class NumberArrays {
    public static void main(String[] args) {
        int[] weekOne = {79, 94, 93, 93, 91, 73, 79};
        int[] weekTwo = {90, 92, 85, 86, 88, 90, 95};
        String[] names = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int WeekOneSum = 0;
        int WeekTwoSum = 0;

        System.out.println("Week 1 High Temperatures");
        //printing week of temperatures
        for (int index = 0; index < weekOne.length; index++) {
            System.out.println(weekOne[index]);
        }

        System.out.println("Week 2 High Temperatures");
        //printing week of temperatures
        for (int index = 0; index < weekTwo.length; index++) {
            System.out.println(weekTwo[index]);
        }
        //adding temperatures together and then do average outside the for loop
        for (int index = 0; index < weekOne.length; index++) {
            WeekOneSum += weekOne[index];
        }
        float average = WeekOneSum / (float) weekOne.length;
        System.out.println("The average daily-high temperature for week 1 is " + average + ".");

        //adding temperatures together and then do average outside the for loop
        for (int index = 0; index < weekTwo.length; index++) {
            WeekTwoSum += weekTwo[index];
        }
        average = WeekTwoSum / (float) weekOne.length;
        System.out.println("The average daily-high temperature for week 2 is " + average + ".");


        System.out.println("The highest temperature in week 2 was on " + maxWeather(weekOne,names));

        System.out.println("The highest temperature in week 2 was on " + maxWeather(weekTwo,names));

    }

    public static String maxWeather(int[] array, String[]a) {//do string because you want it to return a string
        String day=" ";
        int max = array[0];//set int to array[0] because could be more or less than 0 but the first number in array is largest for now
        //finding max value in the array that will be plugged in when we use this method
        for (int i = 1; i < array.length; i++) {//start loop at 0 because array also start at 0, not super necessary here because already at 0 so here we'll do = to 1
            if (array[i] > max) { // when put i in loop, linking it to loop, this will check every index 1st to end
                max = array[i]; //can't just do return max here because haven't checked the rest so return outside the loop
                day = a[i];
            }
        }return day+ " at "+max+"."; //returns a string
    }
}
