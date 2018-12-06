package PatternMaker;

import java.util.ArrayList;

public class Pattern {

    //has a's
    //ArrayList<Stitch> stitches
    //double jamRate

    //behaviors

    protected ArrayList<Stitch> stitches;
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
        if (Math.random ()<jamRate)
        {
            for(int i=0; i< stitches.size ()/2; i++)
            {
                stitches.get(i).sew();
            }

        } else{
            for(int i=0; i< stitches.size (); i++)
            {
                stitches.get(i).sew();
            }
        }
    }
}
