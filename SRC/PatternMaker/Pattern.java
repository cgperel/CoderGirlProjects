package PatternMaker;

import java.util.ArrayList;

public class Pattern {

    //has a's
    //ArrayList<Stitch> stitches
    //double jamRate

    //behaviors



    protected static ArrayList<Stitch> stitches;
    protected double jamRate;

    //constructor
    public Pattern() {
//pattern()- will look at list and will call the sew to print them
        // - how will it know to print which pattern?
        //use an array or arraylist- an array of stitches
        //can put any subclasses in the array
        
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
