package PatternMaker;

import java.util.ArrayList;

public class Stitch {
    protected String oneStitch= " ";
    //default constructor
    public Stitch(){
    }

    //not default constructor
    public Stitch(String oneStitch){
        this.oneStitch=oneStitch;
    }

    //prints one stitch
    public void sew(){
        System.out.print (oneStitch);
    }
}



