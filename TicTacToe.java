import java.util.*;
public class TicTacToe {

   public static void main(String[] args) {
   
      char [] [] gameBoard = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};
                            
      printGameBoard(gameBoard);
      
      // prompts the user for input.
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your placement (1-9): ");
      int pos = scan.nextInt();
      
      System.out.println(pos);
      
      switch(pos) {
         case 1:
            gameBoard[0][0] = 'X';
            break;
         case 2:
            gameBoard[0][02] = 'X';
            break;
         case 3:
            gameBoard[0][0] = 'X';
            break;
         case 4:
            gameBoard[0][0] = 'X';
            break;
         case 5:
            gameBoard[0][0] = 'X';
            break;
         case 6:
            gameBoard[0][0] = 'X';
            break;
         case 7:
            gameBoard[0][0] = 'X';
            break;
         case 8:
            gameBoard[0][0] = 'X';
            break;
         case 9:
            gameBoard[0][0] = 'X';
            break;


      }
   }
   
   // Prints out gameBoard  
   public static void printGameBoard(char[][] gameBoard) {
      for(char[] row : gameBoard) {
         for(char c : row) {
            System.out.print(c);
         }
         System.out.println();
      }
   }
   
} // End of TicTacToe class.