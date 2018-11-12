package PatternMaker;

import java.util.ArrayList;

public class TapestryController {
    private ArrayList<Pattern> stitches;
  //  private String oneStitch= " ";

    public TapestryController(){
        stitches = new ArrayList<Pattern> (stitches);
    }
    /*public void addStitchesToPattern(String oneStitch){
        stitches.add (oneStitch);
    }*/


    public static void main(String[] args){
        BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern ();
        //blockyBaublePattern.sewPattern ();
        blockyBaublePattern.printThePattern();

        BlockStitch blockStitch = new BlockStitch ();
        blockStitch.printStitch ();






        //BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern ();

         /* ShortLineStitch stitchOne = new ShortLineStitch ();
          stitchOne.sew ();

          Stitch stitchTwo=new SmallCrossStitch ();
          ((SmallCrossStitch) stitchTwo).sew ();

          Stitch stitchThree = new LargeCrossStitch ();
          ((LargeCrossStitch) stitchThree).sew();

          Stitch stitchFour = new BlockStitch ();
          ((BlockStitch) stitchFour).sew();

          BrokenWigglePattern onePattern = new BrokenWigglePattern ();
          onePattern.printPattern ();
*/
        // BlockyBaublePattern firstPattern = new BlockyBaublePattern ();
        // firstPattern.createPattern ();
//         BlockyBaublePattern.createPattern();




          }

}
