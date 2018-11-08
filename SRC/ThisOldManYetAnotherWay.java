public class ThisOldManYetAnotherWay {
    public static void counting(String count, String thing)
    {
        System.out.println("This old man, he played " + count);
        System.out.println("He played knick-knack on my " + thing);
    }
    public static void repeat ()
    {
        System.out.println("With a knick-knack paddywhack,");
        System.out.println("Give the dog a bone,");
        System.out.println("This old man came rolling home.\n");
    }
    public static void main (String [] args)
    {
        counting("one", "thumb");
        repeat();

        counting("two", "shoe");
        repeat();

        counting("three", "knee");
        repeat();

        counting("four", "door");
        repeat();

        counting("five", "hive");
        repeat();

        counting("six", "sticks");
        repeat();

    }
}
