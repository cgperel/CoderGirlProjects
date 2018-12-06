package PatternMaker;

import java.util.ArrayList;

public class Stitch {

    //has-a
    //String stitchType

    //behavior
    //public void sew()
    //how do  I make sure each stitch has different type?

    protected String oneStitch= " ";
   //not default constructor
    public Stitch(String oneStitch){
        this.oneStitch=oneStitch;
    }
    //why when I make this.oneStitch="hi" does it not print?

    //prints one stitch
    public void sew(){
        System.out.print (oneStitch);
    }
}



