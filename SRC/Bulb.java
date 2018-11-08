public class Bulb {
    static int bulbCount=0;
    boolean bulbIsLit = false;
    public Bulb(boolean lit){
        this.bulbIsLit = lit;
        Bulb.bulbCount++;
    }
    public static void main(String[] args)
    {
        Bulb[]bulbs=new Bulb[10];
        for(int i =0;i<6;i++){
            bulbs[i]=new Bulb(false);
        }
        for (int i = 6; i<10; i++){
            bulbs[i]=new Bulb(true);
        }
        System.out.println(Bulb.bulbCount);
    }
}
