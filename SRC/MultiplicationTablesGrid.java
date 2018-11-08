import java.util.Scanner;
public class MultiplicationTablesGrid {
    public static void main(String[] args) {
        System.out.println("How large would you like to see them?");
        Scanner keyboard = new Scanner(System.in);
        int limit = keyboard.nextInt();
        System.out.print(" ");
        for (int j = 0; j < limit; j++) {
            if (j >= 10) {
                System.out.print(" ");
            }
            if (j < 10) {
                System.out.print("  ");
            } System.out.print(j);
        }
            System.out.println();

            for (int rows = 0; rows < limit; rows++) {
                System.out.print(rows);
                for (int columns = 0; columns < limit; columns++) {
                    if ((columns * rows) >= 10) {
                        System.out.print(" ");

                    }
                    if ((columns * rows) < 10) {
                        System.out.print("  ");
                    }
                    System.out.print(columns * rows);
                }
                System.out.println();
            }

        }
    }
    //System.out.println(firstNumber+"*"+secondNumber+"="+firstNumber*secondNumber);