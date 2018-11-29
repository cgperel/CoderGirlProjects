package PatternMaker;

import java.util.ArrayList;

public class Stitch {

    //has-a
    //String stitchType

    //behavior
    //public void sew()
    //how do  I make sure each stitch has different type?

    protected String oneStitch= " ";
    //default constructor
    public Stitch(){
    }
    //not default constructor
    public Stitch(String oneStitch){
        this.oneStitch=oneStitch;
    }
    //why when I make this.oneStitch="hi" does it not print?

    //prints one stitch
    public void sew(){
        System.out.print (oneStitch);
    }

public static void main(String[]args) {
        ShortLineStitch shortLine = new ShortLineStitch ();
        shortLine.sew ();
        FillStitch fillStitch = new FillStitch ();
        fillStitch.sew ();
        LargeCrossStitch largeCrossStitch = new LargeCrossStitch ();
        largeCrossStitch.sew ();
        CircleStitch circleStitch = new CircleStitch ();
        circleStitch.sew ();
    }
}



