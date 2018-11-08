public class Course {
    //has a;
    //name
    //credits
    // number of students
    // roster
    private String name;
    private int credits;
    private int numberOfSeats;
    private Student[] roster;//array is the type

    public Course(String name, int credits, int numberOfSeats){//put the variables in the paramter to describe the object but if you
        //they're the same no need to put it in the parameter. or for roster it's empty so no input so no need to include in parameter
        this.name = name;
        this.credits = credits;
        this.numberOfSeats = numberOfSeats;
        //we want to create an empty array that students will sign up and we'll add as they sign up, the array can go up to the amount of number of seats
        this.roster = new Student[numberOfSeats];
        //all these variables have a value but they're null so be careful for later

    }
    public void registerStudent(Student s){
        if(numberOfSeats > 0) {//or could do =1 or <=0
            this.roster[numberOfSeats - 1] = s;//last person will be at position 0- this is action of putting it into the array
            numberOfSeats--; //or numberOfSeats=numberOfSeats-1

        }
    }
    public static void main(String[]args){
        Course history = new Course("History", 6, 30);
    }
}
