package PatternMaker;

public class SmallCrossStitch extends Stitch {

    Stitch smallCrossStitch;

    public SmallCrossStitch(){
        this.smallCrossStitch = new Stitch ("x");
    }

    public Stitch getSmallCrossStitch() {
        return smallCrossStitch;
    }



    /*public void printStitch(){smallCrossStitch.sew ();
    }*/

}
