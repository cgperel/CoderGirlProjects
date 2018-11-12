package PatternMaker;

import java.util.ArrayList;

public class BlockyBaublePattern extends Pattern {
    ArrayList<Stitch> blockyBaublePatternStitches = new ArrayList();

    public BlockyBaublePattern(){
        this.blockyBaublePatternStitches = createPattern ();

    }


    public ArrayList<Stitch> createPattern(){
        Stitch firstStitch = new BlockStitch ();
        ShortLineStitch secondStitch = new ShortLineStitch ();
        ShortLineStitch thirdStitch = new ShortLineStitch ();
        CircleStitch fourthStitch = new CircleStitch ();

     blockyBaublePatternStitches.add (new BlockStitch ());
     blockyBaublePatternStitches.add (new ShortLineStitch ());
     /* blockyBaublePatternStitches.add (thirdStitch);
     blockyBaublePatternStitches.add (fourthStitch);*/
        addStitchToPattern (firstStitch);
        addStitchToPattern (secondStitch);
        addStitchToPattern (thirdStitch);
        addStitchToPattern (fourthStitch);

        return blockyBaublePatternStitches;
    }

    public void printThePattern(){
        printPattern (blockyBaublePatternStitches);
    }



    //create instance of blockstitch stitch

    //Pattern should have an array list of stitches
}
