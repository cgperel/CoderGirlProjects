public class Cat {

    //has a: Cat has a ______ - these will become instance variables
    //name String*
    //fur int*
    //tail boolean
    //ears String
    //lives int
    //birthday Date(date is an object- we can use objects as types with classes)
    private String name;
    private int fur;
    private int lives; //don't need input parameter at constructor beacuase all cats have nine lives- if we know number will be same value just put number in

    public Cat(String name, int fur){
        this.lives = 9;
        this.name = name;
        this.fur = fur;
    }

    //can (do)- these are behaviors- these will become methods
    //hunt boolean- if you caught something (String prey)- input parameters?
    //void meow()*
    //play(String toy)
    //eat(String food)
    //sleep(int hours)
    //shed (int quantity)*
    public void meow(){
        System.out.println(this.name + " says meow!");
    }

    public void shed(int quantity){//quantity can never be larger than amount of fur
        if(quantity < this.fur) {
            this.fur = this.fur - quantity;
        } else {
            this.fur = 0;//either do nothing or fur=0
        }
    }
    public int getFur(){
        return this.fur;
    }

    public static void main(String[] args){
        Cat franklin=new Cat("Franklin", 100);
        franklin.meow();//name of variable and then make the variable do the action
        franklin.shed(55);
        System.out.println(franklin.getFur());
        Cat sally=new Cat("Sally", 100);
        sally.meow();
        sally.shed(5);
        System.out.println(sally.getFur());
    }
}
