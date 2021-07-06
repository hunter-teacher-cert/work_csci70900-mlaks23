// 2/Mancala.java
//Collaborators: Marisa Laks, Julian Irimina, Mamadu Wally

/*
We need to know how many stones are in each pot and how to store the new amounts after dropping them

*/

import java.util.Scanner;
import java.util.*;

public class myMancala1 {

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

choosePot();




//start at index n and add one to each of the following pots.
//I choose from pots 7 - 12. In my turn I will never drop a stone into pot 0. After 13 I go to 6. Then to 5.
try {
      for( int i = pot; i< (pot+4); i++ ) {
        board[i]++;
      }
    }

  catch (ArrayIndexOutOfBoundsException e) {
      if (pot == 11){
        for (int i = 0; i < 1; i++) {
        board[i]++;
      }
    } else if (pot == 12) {
        for (int i = 0; i < 2; i++) {
        board[i]++;
          }
          }
        }

    printArray(board, pot);



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

  public static void printArray(int[] a, int pot){
    System.out.print(" {");
    for (int i = 0; i < 14; i++) {
      System.out.print(a[i] + "  ");
    }
    System.out.println("}");
  }

  public static void copyArray(int[] a) {
    int [] newArray = new int [14];
    for (int i = 0; i < 14; i++ ) {
      newArray[i] = a[i];
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
