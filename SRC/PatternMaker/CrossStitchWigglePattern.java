package PatternMaker;

public class CrossStitchWigglePattern extends Pattern {
    public CrossStitchWigglePattern(){
        jamRate = .05;
        for(int i = 0;i<=5;i++){
            stitches.add (new SmallCrossStitch ());
            stitches.add (new LargeCrossStitch ());
        }
    }
}
