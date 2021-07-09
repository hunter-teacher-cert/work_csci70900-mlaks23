// 2/myMancala.java
//Collaborators: Marisa Laks
//I've been working on this on my own. It's work in progress.



import java.util.Scanner;
import java.util.*;

public class myMancala {

  public static void myTurn (int[] a) {

  int [] board = new int[14];
  for (int i = 0; i < 1; i++) {
    board[i] = 0;
  }
  for (int i = 1; i < 13; i++) {
    board[i] = 4;
  }
  for (int i = 13; i < 14; i++) {
    board[i] = 0;
  }

int pot = choosePot();




//start at index n and add one to each of the following pots.
//I choose from pots 7 - 12. In my turn I will never drop a stone into pot 0. After 13 I go to 6. Then to 5.
try {
      for( int i = pot; i< (pot+5); i++ ) {
        board[i]++;
        board[pot] = 0;
      }
    }

  catch (ArrayIndexOutOfBoundsException e) {
      if (pot == 10) {
        for (int i = 6; i < 7; i++){
          board[i]++;
        }
      }
      else if (pot == 11){
        for (int i = 5; i < 7; i++) {
        board[i]++;
      }
    } else if (pot == 12) {
        for (int i = 4; i < 7; i++) {
        board[i]++;
          }
          }
        }

  printBoard(board);

//Not sure if I need to copy the board each time
  //copyBaoard(board); //can't get this to work

  int[] AIboard = new int[14];
   for (int i = 0; i < 14; i++) {
     AIboard[i] = board[i];
   }

  int AIpot = AIChoice();


/*
//How to get the AI turn to start at pot 6 and count down?
    try {
        for( int i = AIpot; i < 7; i = AIpot--) {
          AIboard[AIpot] = 0;
          AIboard[i]++;
        }
      }

    catch (ArrayIndexOutOfBoundsException e) {
        if (AIpot == 3){
          for (int i = 7; i < 14; i++) {
          AIboard[i]++;
        }
      } else if (AIpot == 2) {
          for (int i = 8; i < 14; i++) {
          AIboard[i]++;
            }
      } else if (AIpot == 1) {
        for (int i = 9; i < 14; i++) {
          AIboard[i]++;
        }
      }

          }
  printBoard(AIboard);

*/


   }



   public static void gameBoard (int[] a) {
//index 0 is the AI big pot, indices 1 - 6 are the AI small pots, indices 7-12 are your small pots and index 13 is your big pot

      int [] board = new int[14];

      for (int i = 0; i < 1; i++) {
        board[i] = 0;
      }
      for (int i = 1; i < 13; i++) {
        board[i] = 4;
      }
      for (int i = 13; i < 14; i++) {
        board[i] = 0;
      }

      System.out.print(" {");
      for (int i = 0; i < board.length; i++) {
          System.out.print(board[i] + "  ");
        }
      System.out.println("}");
     }

  public static void printBoard(int[] a){

    System.out.print(" {");
    for (int i = 0; i < 14; i++) {
      System.out.print(a[i] + "  ");     //can the array print on two lines?
    }
    System.out.println("}");
  }

//Can't get this to work as a method
  public static void copyBoard(int[] a) {
    int [] newBoard = new int [14];
    for (int i = 0; i < 14; i++ ) {
      newBoard[i] = a[i];
    }
  }

  public static int choosePot () {
    System.out.print("Which pot would you like to pick from? Choose from pots 7 - 12. ");

    Scanner in = new Scanner(System.in);
    int pot = in.nextInt();

    while (pot < 7 || pot > 13) {
        System.out.print("That is not a valid move. Please choose again.");
        System.out.print("Which pot would you like to pick from? Choose from pots 7 - 12. ");
        pot = in.nextInt();
      }

    System.out.print("You chose pot " + pot + ".");
    return pot;
  }

  public static int AIChoice () {
    int AIpot = 0;
    Random random = new Random();
    AIpot = random.nextInt(5) + 1;
    System.out.print("The computer chose pot " + AIpot + ". ");
    return AIpot;
  }


  public static void main (String[] args) {
      System.out.println("This is the game of Mancala. The object of the game is to collect as many stones as possible. Each player picks up stones from their side and drops them in the pots.");

      System.out.println();
      int [] board = new int[14];

      System.out.print("your side ");
      System.out.print(" 0");
      for(int i =1; i<=6; i++) {
      System.out.print(" 4");
      }
      System.out.println();

      System.out.print("           ");
      for(int i = 7; i<= 12; i++) {
        System.out.print(" 4");
      }
      System.out.print(" 0");
      System.out.println(" my side ");
      System.out.println();

      int[] newBoard = new int[14];


      gameBoard(board);
      myTurn(board);




    }

  }
