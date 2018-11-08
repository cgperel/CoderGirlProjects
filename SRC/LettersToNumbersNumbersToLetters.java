public class LettersToNumbersNumbersToLetters {
    public static void main(String [] args){
        {
            int nums[]={89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33};
            for(int index=0;index<nums.length;index++){
                char letters=(char) nums[index];
                System.out.print(letters);
            }
        }
        System.out.print("\n ");
        {
            char chars[]={'C', 'r', 'o', 'w', ' ','f', 'l','i', 'e', 's', ' ', 'a', 't', ' ', 'd', 'a', 'w', 'n', '.'};
            for(char index=0; index<chars.length; index++){
                int nums=(int) chars[index];
                System.out.print(nums+", ");
            }
        }
    }
}
//Crow flies at dawn.
//67, 114, 111, 119, 32, 102, 108, 105, 101, 115, 32, 97, 116, 32, 100, 97, 119, 110,46