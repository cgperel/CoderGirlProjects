public class AsciiChart {
    public static void main(String[] args){
        {
            for(int index=32; index<=255; index++)
            {
                char letter = (char) index;
                System.out.print(index);
                System.out.println(" "+letter);
            }


        }
    }
}
