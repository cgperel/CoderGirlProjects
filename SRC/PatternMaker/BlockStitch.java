package PatternMaker;

public class BlockStitch extends Stitch {
    Stitch blockStitch;

    public BlockStitch(){
        this.blockStitch=new Stitch ("[]");
    }
    //Stitch blockStitch = new Stitch ("[]");


  public void printStitch(){
        blockStitch.sew ();
    }
}
