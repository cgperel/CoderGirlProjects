package PatternMaker;

public class BlockyBaublePattern extends Pattern {

    public static void createPattern(){
        BlockStitch firstStitch = new BlockStitch ();
        ShortLineStitch secondStitch = new ShortLineStitch ();
        ShortLineStitch thirdStitch = new ShortLineStitch ();
        CircleStitch fourthStitch = new CircleStitch ();

        addStitchToPattern (firstStitch);
        addStitchToPattern (secondStitch);
        addStitchToPattern (thirdStitch);
        addStitchToPattern (fourthStitch);



    }



    //create instance of blockstitch stitch

    //Pattern should have an array list of stitches
}
