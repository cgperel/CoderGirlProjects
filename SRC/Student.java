public class Student {
    private String name;
    private int IdNumber;
    //use static for idnumber- it increments and everyone has a diffaerent 6 digit number
    private static int nextIdNumber = 100000;//ID numbers are unique- fact that it's unique should remind you of status
    private int credits;//they could start at 0 or if transfer student, the number could be different- so maybe yes or no to use in constructor
    private double gpa;//they could start at 0 or if transfer student, the number could be different- so maybe yes or no to use in constructor

    public Student(String name, int credits, double gpa){//don't do idnumber here beacuse could mess up the fact that it's unique
            this.name = name;
            this.credits = credits;
            this.gpa = gpa;
            this.IdNumber = nextIdNumber;
            nextIdNumber++;
    }

    //get class standing
    public String getClassStanding(){
        if(this.credits<=30){
            return "Freshman";
        } else if(this.credits<=60){
            return "Sophmore";
        } else if(this.credits<=90){
            return "Junior";
        } else {
            return "Senior";
        }
    }
    //setCredits
    public void setCredits(int credits){//do we need parameters? yes, amount of new value
        this.credits = credits;
    }

    //setGPA
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public static void main(String[] args){
        Student sally = new Student("Sally",120,3.00);
        Student franklin = new Student("Franklin", 0, 1.5);

        System.out.println(sally.getClassStanding());
        System.out.println(franklin.getClassStanding());

        System.out.println (sally);
        System.out.println (franklin);
    }

   public String toString(){//this is so you can print out objects or you can create getters, don;t need to call the method because it's automatic
        return this.name + " "+ this.IdNumber;
   }
}
