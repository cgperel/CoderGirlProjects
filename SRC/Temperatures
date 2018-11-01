public class Temperatures {
    public static void main(String[] args) {
        int[][] temps = {
                //0, 1,  2,  3,  4,  5,  6
                {68, 70, 76, 70, 68, 71, 75},//0
                {76, 76, 87, 84, 82, 75, 83},//1
                {73, 72, 81, 78, 76, 73, 77},//2
                {64, 65, 69, 68, 70, 74, 72}//3
        };
        printTable(temps);
        System.out.println();
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int day = 0; day < days.length; day++) {
            System.out.print(days[day] + ": ");
            System.out.println(average(temps, day));
        }
        String[] times = {"7:00 AM", "3:00 PM", "7:00 PM", "3:00 AM"};
        System.out.println();
        for (int time = 0; time < times.length; time++) {
            System.out.print(times[time] + ": ");
            System.out.println(timeAverage(temps, time));
        }
        System.out.println();
        System.out.print("Total average is: ");
        System.out.println(totalAverage(temps));
    }

    public static int[][] printTable(int[][] temps) {
        //working to print table
        for (int b = 0; b < temps.length; b++) {
            for (int a = 0; a < temps[b].length; a++) {//should [b] be a zero???
                System.out.print(temps[b][a]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return temps;
    }

    public static float average(int[][] array, int index) {
        float dayAverage = 0;
        int daySum = 0;
        for (int b = 0; b < array.length; b++) {
            daySum += array[b][index];
        }
        dayAverage = (float) daySum / array.length;
        return dayAverage;
    }

    public static float timeAverage(int[][] array, int index) {
        float timeAverage;
        int timeSum = 0;
        for (int b = 0; b < array[0].length; b++) {
            timeSum += array[index][b];
        }
        timeAverage = (float) timeSum / array[0].length;
        return timeAverage;
    }

    public static float totalAverage(int[][] array) {
        float totalAverage;
        int totalSum = 0;
        for (int c = 0; c < array.length; c++) {
            for (int d = 0; d < array[0].length; d++) {
                totalSum += array[c][d];
            }
        }
        float totalFirstAverage = (float) totalSum / array.length;
        totalAverage = totalFirstAverage/array[0].length;
        return totalAverage;
    }
}

