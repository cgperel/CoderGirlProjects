package PatternMaker;

import java.util.ArrayList;

public class Pattern {

    protected static ArrayList<Stitch> stitches;

    //constructor
    public Pattern() {
        this.stitches = new ArrayList<Stitch> ( );
    }

    public void sewPattern(){
        System.out.println (stitches);
    }

   public ArrayList<Stitch> addStitchToPattern(Stitch a){
        stitches.add (a);
        return stitches;
    }

    public void printPattern(ArrayList<Stitch> patternToPrint){
        for(int i=0; i< patternToPrint.size (); i++)
        {
            patternToPrint.get(i).sew();
        }
    }

    /*public ArrayList getPatterns() {return stitches;}*/
}
