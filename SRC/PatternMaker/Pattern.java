package PatternMaker;

import java.util.ArrayList;

public class Pattern {

    protected static ArrayList<Stitch> stitches;

    //constructor
    public Pattern() {
        stitches = new ArrayList<Stitch> ( );
    }

    public void sewPattern(){
        System.out.println (stitches);
    }

   public void addStitchToPattern(Stitch a){
        stitches.add (a);
    }

    public void printPattern(ArrayList<Pattern> patternToPrint){
        for(int i=0; i< patternToPrint.size (); i++)
        {
         //   patternToPrint.get(i).sew();
        }
    }

    public static void main(String[] args){
        BlockyBaublePattern blocky = new BlockyBaublePattern ();
       // blocky.addStitchToPattern ();
        //blocky.printPattern (stitches);
        System.out.println (blocky);
    }
    /*public ArrayList getPatterns() {return stitches;}*/
}
