package PatternMaker;

import java.util.ArrayList;

public class TapestryController {

    public TapestryController(){

    }

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
    }

}
