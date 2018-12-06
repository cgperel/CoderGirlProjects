package PatternMaker;

public class BrokenWigglePattern extends Pattern {
    public BrokenWigglePattern(){
        jamRate=.40;
        for(int i = 0;i<=5;i++){
            stitches.add (new SmallCrossStitch ());
            stitches.add (new LargeCrossStitch ());
        }
    }



    public void printPattern(){

        //for(int i=0; i<=8; i++){

         /*   SmallCrossStitch.sew();
            LargeCrossStitch.sew();*/
        //}
    }



    public static void main(String[] args){
        BrokenWigglePattern brokenWigglePattern = new BrokenWigglePattern ();
        brokenWigglePattern.sewPattern ();
       // brokenWigglePattern.printPattern ();
        //System.out.println (brokenWigglePattern.printPattern ());
    }

}
