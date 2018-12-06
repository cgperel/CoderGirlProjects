package PatternMaker;

import java.util.ArrayList;

public class BlockyBaublePattern extends Pattern {
    //has-a
    //ArrayList<Stitch> stitches (inherited from pattern)
    //jam rate in the constructor

    //behavior
    //pattern() (inherited from Pattern)

    //just constructor here
    public BlockyBaublePattern(){
        jamRate = .10;
        for(int i = 0; i<=3; i++){
            stitches.add (new BlockStitch ());
            stitches.add (new ShortLineStitch ());
            stitches.add (new ShortLineStitch ());
            stitches.add (new CircleStitch ());
            stitches.add (new ShortLineStitch ());
            stitches.add (new ShortLineStitch ());
        }
    }
}
