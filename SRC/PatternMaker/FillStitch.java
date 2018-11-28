package PatternMaker;

public class FillStitch extends Stitch {
    public FillStitch(String oneStitch){
        super("=");
    }
    Stitch fillStitch = new Stitch ("=");

    public void printStitch(){
        fillStitch.sew ();
    }
}
