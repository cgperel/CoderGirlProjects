public class Story {
    public static void main(String[] args) {
        int MichaelAge;
        MichaelAge = 30;
        int SallyAge;
        SallyAge = (MichaelAge*2);
        Double BillAge = SallyAge * (4.0 / 3);
        Double RachelAge = BillAge - 52;
        System.out.println("The average age of the group is " + (MichaelAge+SallyAge+BillAge+RachelAge) / 4);
    }
}
