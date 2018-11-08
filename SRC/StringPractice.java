public class StringPractice {
    public static int countGs(String text) //string is an array of characters
            //could also change this method to count characters not a specific letter (String text, char findMe)
    {
        int count = 0;
        for(int i = 0; i<text.length();i++)//this .length had parentheses so it's a method, other times it's not a method, it's just a number
        {
            System.out.print(text.charAt(i));
            char letter = text.charAt(i);
            if(Character.toLowerCase(letter)=='g')//single quote is char and double quote is string
            //could also do or statement 'g' || 'G'
                //could also convert whole string to lower case and then count text=text.toLowerCase(); do it above for statement
                //3 different ways to go, not necessarily one better but can decide which one and it can work and if not can do another
            {
                count++;
            }
        } return count;
    }
    public static void main(String[] args){
        System.out.print(countGs("Gotta go to google"));
        //if counting character with find me do (text, 'char');, make program way more wide and can be used for much more
    }
}
