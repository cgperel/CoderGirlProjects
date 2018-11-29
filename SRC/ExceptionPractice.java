public class ExceptionPractice {

    private int threshold;;

    public ExceptionPractice (int threshold){
        this.threshold = threshold;
    }

    public int doTheThing (int value){
        if(value < threshold){
            throw new IllegalArgumentException(); //proper way to throw an exceptions
        }
        return value * 2;
    }

    public int doTheOtherThing(int value){
        return value * 2;

    }

    public static void main(String[]args){
        ExceptionPractice ep = new ExceptionPractice (0);
        try {
            int result = ep.doTheThing (-2);
            System.out.println (result);//don't put this in try because won't show exception
        } catch (IllegalArgumentException e) {//could also just write Exception but more specific is better- Exception will catch any problem, more specific will catch just this. E is almost always e- but could call it whatever you want
            System.out.println ("I was expecting values greater than 0.");
            e.printStackTrace ();
        }
    }
}
