package PatternMaker;

import java.util.ArrayList;

public class BlockyBaublePattern extends Pattern {


    //has-a
    //ArrayList<Stitch> stitches (inherited from pattern)
    //jam rate in the constructor

    //behavior
    //pattern() (inherited from Pattern)

    //just constructor here

    ArrayList<Pattern> stitches;

    public BlockyBaublePattern(){


        //add the stitches in each subclass

        this.stitches = createPattern ();
    }

    public ArrayList<Pattern> createPattern(){

        Stitch firstStitch = new BlockStitch ();
        ShortLineStitch secondStitch = new ShortLineStitch ();
        ShortLineStitch thirdStitch = new ShortLineStitch ();
        //CircleStitch fourthStitch = new CircleStitch ();

       /* stitches.add (firstStitch (BlockStitch));
         stitches.add (new BlockStitch ());
     stitches.add (new ShortLineStitch ());*/
     /* blockyBaublePatternStitches.add (thirdStitch);
     blockyBaublePatternStitches.add (fourthStitch);*/
        addStitchToPattern (firstStitch);
        addStitchToPattern (secondStitch);
        addStitchToPattern (thirdStitch);
        //addStitchToPattern (fourthStitch);
        return stitches;
    }

    public void printThePattern(){
        printPattern (stitches);
    }
        //create instance of blockstitch stitch

    //Pattern should have an array list of stitches
}
