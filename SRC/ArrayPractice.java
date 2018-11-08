public class ArrayPractice {
    public static int maxArray(int[] array) //returning integer, then name method, then saying we'll pull an array
    {
        //return the largest value in the array, don't know the largest number that we'll get, it could be anything or nothing
        if(array.length==0){
            return Integer.MIN_VALUE;
        }
        int max = array[0];//set int to array[0] because could be more or less than 0 but the first number in array is largest for now
        for(int i=1; i<array.length;i++){//start loop at 0 because array also start at 0, not super necessary here because already at 0 so here we'll do = to 1
            if(array[i]>max){ // when put i in loop, linking it to loop, this will check every index 1st to end
                max=array[i]; //can't just do return max here because haven't checked the rest so return outside the loop
            }

        }
        return max;
    }
    public static void main(String[]args){
        int[] a1={4, 6, 0, -3, 2, 11};
        int[]a2= new int[3]; //nothing inside this array, just all 0's, better if asking user to type in values, type empty array and insert once they give you numbers
        a2[0]=4;
        a2[1]=9;
        a2[2]=2;
        int max1=maxArray(a1);
        int max2=maxArray(a2);
        System.out.println("Max is "+max1+".");
        System.out.println("Max is "+max2+".");
    }
}

