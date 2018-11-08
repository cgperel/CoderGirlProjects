public class TwoArraysApplesAndOranges {
    public static void main(String[] args) {
        String[] names={"Jenny", "Sally", "Joel", "Bobbi"};
        int[] ages = {9,7,6,3};

            //printing childs name and age
        for(int index=0; index<names.length; index++)
        {
            System.out.print(names[index]+ " is ");
            System.out.println(ages[index]+ " years old.");

        }


    }
}
    /*int[] apples = {1, 3, 5, 7, 9, 7};
    int[] oranges= {8, 6, 4, 2, 0, 2};
    int[] sums = new int[6];
    //adding each index place together
    for(int index = 0; index<6; index++)
    {
        sums[index]=apples[index] + oranges[index];
        System.out.println(index+" sum is " + sums[index]);
    }

    }*/


/*    int[] values = {1, 2, 1, 4, 5, 2, 3, 9, 7, 6, 5, 3, 1};
    int sum = 0;
        adding everything together and the number of sums
        for (int index = 0; index < values.length; index++) {
        sum += values[index];
        }
        float average = sum / (float) values.length;
        System.out.println("The average value is " + average);
*/

/*
int[] values = {24, 16, 32, 14, 20, 100, 38};
        //Divide every value in half
        for (int index=0; index<values.length;index++)
        {
            values[index] = values[index]/2;
            System.out.println(values[index]);
        }
 */