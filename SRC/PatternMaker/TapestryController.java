package PatternMaker;

import java.util.ArrayList;

public class TapestryController {
   // private ArrayList<Stitch> stitches;
  //  private String oneStitch= " ";

    public TapestryController(){
        /*stitches = new ArrayList<Stitch> (stitches);*/
    }
    /*public void addStitchesToPattern(String oneStitch){
        stitches.add (oneStitch);
    }*/


    public static void printAllPatterns(Pattern a){
        for(int i=0; i<3;i++){
            System.out.println (" ");
            for (int j=0; j<8; j++){
                a.sewPattern ();

            }
        }
    System.out.println ("");
    for(int k=0; k<8;k++){
        System.out.println ("");
        for (int l=0;l<6; l++)
            a.sewPattern ();

    }
        System.out.println ("");
    }





    public static void main(String[] args){

        CrossStitchWigglePattern crossy = new CrossStitchWigglePattern ();
        printAllPatterns (crossy);

        ZigZagLinesPattern ziggy = new ZigZagLinesPattern ();
        printAllPatterns (ziggy);

        BaublePattern bauby = new BaublePattern ();
        printAllPatterns (bauby);

        BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern ();
        printAllPatterns(blockyBaublePattern);

        BrokenWigglePattern brokenWigglePattern = new BrokenWigglePattern ();
        printAllPatterns (brokenWigglePattern);

      //  blockyBaublePattern.printThePattern();

        //BlockStitch blockStitch = new BlockStitch ();
        //blockStitch.printStitch ();


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

        // BlockyBaublePattern firstPattern = new BlockyBaublePattern ();
        // firstPattern.createPattern ();
         BlockyBaublePattern.createPattern();*/

          }

}
