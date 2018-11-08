public class MultiDimensionArrayPractice {
    public static void main(String[]args){
        int[][]a={
                {1, 2, 3},
                {4, 5, 9, 9},
                {7}

        };
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
}
/*public static void main(String [] args){
        int grid[][]=new int[6][4];
        grid[2][3]=9;
        for(int row=0;row<6;row++)
        {
            for(int column=0;column<4;column++)
            {
                System.out.println(row+", "+column+" : "+ grid[row][column]);
            }
        }
    }*/