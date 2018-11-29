package PatternMaker;

import java.util.ArrayList;

public class ShortLineStitch extends Stitch{
    public ShortLineStitch(){
        //also has a
        // protected String stitchType (inherited from Stitch)
        super("-");

        //behavior
        //public void sew() (inherited from Stitch)

        //all base classes just need constructor- everything else handled by base class
        //just needs constructor - instance variable
    }

    /*Stitch shortLineStitch;
    public ShortLineStitch(){
      this.shortLineStitch = new Stitch ("-");
    }
*/
    @Override
    public String toString(){
        return this.oneStitch;
    }
    public static void main(String[] args){
        ShortLineStitch oneStitch = new ShortLineStitch ();
        oneStitch.sew ();
        System.out.println (oneStitch);
        oneStitch.printStitch ();

    }
    //Stitch shortLineStitch = new Stitch ("-");

   public void printStitch(){
        //this.oneStitch.sew();
     //  oneStitch.sew ();
    }
}
