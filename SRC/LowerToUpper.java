public class LowerToUpper {
    public static void main(String[] args){
        {
            Upper("Why is Easter in the Spring?");
        }
}

public static String Upper (String text)
        {
            for(int i=0; i<text.length();i++)
            {
                text=text.toUpperCase();
            }
            System.out.print(text);
            return text;
        }
}

//"'W', 'h', 'y', ' ', 'i','s',' ','E','a','s','t','e','r',' ', 'i', 'n', ' ', 't', 'h', 'e',' ', 'S', 'p','r','i','n','g','?'};
//String letters[]={"Why is Easter in the Spring?"};