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
    //why when I make this.oneStitch="hi" does it not print?

    //prints one stitch
    public void sew(){
        System.out.print (oneStitch);
    }

public static void main(String[]args) {
        Stitch oneStitch = new Stitch ("hi");
        oneStitch.sew ();
        ShortLineStitch shortLine = new ShortLineStitch ("-");
        shortLine.sew ();

}
}



