package PatternMaker;

public class BaublePattern extends Pattern {
    public BaublePattern(){
        jamRate = .00;
        for (int i =0; i<=5;i++){
            stitches.add (new ShortLineStitch ());
            stitches.add (new ShortLineStitch ());
            stitches.add (new CircleStitch ());
        }
    }
}
