public class NonStaticBulbCount {
        int bulbCount=0;
        boolean bulbIsLit = false;
        public NonStaticBulbCount(boolean lit){
            this.bulbIsLit = lit;
            this.bulbCount++;
        }
        public static void main(String[] args)
        {
            Bulb[]bulbs=new Bulb[10];
            for(int i =0;i<6;i++){
                bulbs[i]=new Bulb(false);
                System.out.println(bulbs[i].bulbCount);
            }
            for (int i = 6; i<10; i++){
                bulbs[i]=new Bulb(true);
            System.out.println(bulbs[i].bulbCount);
            }
        }
}
