package PatternMaker;

import java.util.ArrayList;

public class Pattern {
    protected static ArrayList<Stitch> stitches;
    public Pattern(){this.stitches=new ArrayList<> ();}


    /*public Pattern(String pattern){
        this.pattern=new ArrayList<> ();
    }*/

  public void sewPattern(){
     //   System.out.println (pattern);
  }





    public static ArrayList<Stitch> addStitchToPattern(Stitch a){
        stitches.add (a);
        return stitches;
    }

    public ArrayList getPatterns() {return stitches;}
}
