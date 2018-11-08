package PatternMaker;

public class FillStitch extends Stitch {
    Stitch fillStitch = new Stitch ("=");

    public void printStitch(){
        fillStitch.sew ();
    }
}
