package PatternMaker;

public class ZigZagLinesPattern extends Pattern {
    public ZigZagLinesPattern(){
        jamRate = .00;
        for(int i=0; i<=2;i++){
            stitches.add (new ZigZagStitch());
            stitches.add (new ZigZagStitch());
            stitches.add (new ZigZagStitch());
            stitches.add (new FillStitch ());
            stitches.add (new FillStitch ());
            stitches.add (new FillStitch ());

        }
    }

}

