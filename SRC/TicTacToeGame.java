public class TicTacToeGame {
    public static void main(String[] args) {
        //pieces(nouns)
        //x's and o's
        //game board

        //behaviors(verbs)
        //what square do you want to play?- keep going as long as someone has not won and the board isn't full, it'll take at least 9 moves so use while loops
                        //while empty spaces or board isn't full. to check for empty spaces, could look for . or up to 9
                        //while loops--ask current player where they want to go and insert into array and once they make the play
                        //switch persons turn and then run the while loop
        //track whose turn it is
        //  --make sure space isn't occupied
        //display game board
        //make a blank game board
        //check to see if someone wins (or if the board is full)
        String[][] board = makeNewBoard();
        board[2][2] = "x";
        board[1][2] = "x";
        board[0][2]="x";
        displayBoard(board);
        determineWinner(board);
        System.out.println("Winner is "+determineWinner(board));
    }
    public static String[][] makeNewBoard()//don't need any inputs
    {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {//this is rows, do rows first here, going l to r and then next row and then next row
            for (int j = 0; j < board[0].length; j++) {//saying length of row 0 will tell us how many columns that's board[0].length
                board[i][j]=".";
            }
        }
        return board;
    }

    public static void displayBoard(String[][] board)//use 2 dimensional array- is this string array?
    {
        //cant print array as one chunk, need to print each part and needs 2 for loops because rows and columns
        for (int i = 0; i < board.length; i++) {//this is rows, do rows first here, going l to r and then next row and then next row
            for (int j = 0; j < board[0].length; j++) {//saying length of row 0 will tell us how many columns that's board[0].length
               System.out.print(board[i][j]);

                if (j != 2) {
                    System.out.print("|");
                }

            }
        }
            System.out.println();//this brings it to next row
    }

            //showing how board will work
            // (0.0)(0,1)(0,2)
            //(1.0)(1,1)(1,2)
            //(2.0)(2,1)(2,2)
    public static String determineWinner(String[][]board) {//need game board in input to see if there's a winner or not
        for (int i = 0; i < board.length; i++) {//with for loop 0 becomes i so could check all 3 rows with one for loop
            if (board[i][0].equals(board[0][1]) && board[i][2].equals(board[i][0]) && !board[i][0].equals(".")) { //if top left square and top middle square equal
                return board[i][0];
            }
            if (board[0][i].equals(board[1][i]) && board[2][i].equals(board[0][i]) && !board[0][i].equals(".")) { //if top left square and top middle square equal
                return board[0][i];
            }
        }
        if (board[0][0].equals(board[1][1])&&board[2][2].equals(board[0][0])&&!board[0][0].equals(".")){
            return board[0][0];
        }
        if (board[0][2].equals(board[1][1]) && board[2][0].equals(board[0][2]) && !board[0][2].equals(".")){
            return board[0][0];
        }return "no winner";
        }
    }
