public class Rectangle {
    private double length; //private can't be seen in other classes, all instance variables should be private
    private double width;

    public Rectangle(double length, double width){
    //constructors don't show return type here, cuz same as class, return type is rectange, it just knows cuz its a constructor
        this.length=length;
        this.width=width;
    }

    //getters and setters should be public
    public double getLength(){
        return this.length;// don't need to say this, because no other length in this method (other length is out of scope and this method can't see other method that has length
    }

    public void setLength(double length){
        if(length>0){
            this.length = length;
        }
    }

    public double computeArea(){
        return this.length*this.width;
    }

    public boolean isBiggerThan(Rectangle other){ //big step using rectangle as parameter, not an int or anything like that
        return this.computeArea() > other.computeArea(); //get the area of this rectangle and other rectangle and see if this is bigger
        //this rectangle refers to whichever one we call the method on

    }

    public boolean isBiggerThan(Circle other){//can have same method name because this is for circle
        return this.computeArea() > other.computeArea();
    }

    public static void main(String[] args){
        Rectangle r1= new Rectangle(2, 4); //rectangle is the type that you want to make- it used to be an int or the like
        r1.computeArea(); //need to be specific and compute area of this instance that we have
        System.out.println(r1.computeArea());
        Rectangle r2=new Rectangle(3,5);
        r2.computeArea();
        System.out.println(r2.computeArea());

        System.out.println(r1.isBiggerThan(r2));
        System.out.println(r2.isBiggerThan(r1));

        Circle c = new Circle(2);
        r1.isBiggerThan(c);
        //System.out.println();
    }
}
