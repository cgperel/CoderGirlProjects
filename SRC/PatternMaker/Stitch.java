package PatternMaker;

import java.util.ArrayList;

public class Stitch {

    //default constructor
    public Stitch(){

    }

    private static String oneStitch= " ";

    //not default constructor
    public Stitch(String oneStitch){
        this.oneStitch=oneStitch;
    }

    //prints one stitch
    public static void sew(){
        System.out.print (oneStitch);

    }

}



