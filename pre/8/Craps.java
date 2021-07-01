//Work in Progress

import java.util.Scanner;
import java.util.Random;

public class Craps {

  public static void main (String[] args) {
    practice();
  }

/*
  public static void roll() {
    //System.out.print("Would you like to roll the dice? Enter y or n");
    int min = 1;
    int max = 6;
    int roll1 = (int)Math.floor(Math.random()*(max-min+1)+min);
    System.out.println("Your first roll is: " + roll1);
    int roll2 = (int)Math.floor(Math.random()*(max-min+1)+min);
    System.out.println("Yout second roll is: " + roll2);
    int sum = (roll1 + roll2);
    System.out.println("Your total is: " + (sum));

  }

  public static void shoot(int dice, int maxValue) {
    int dice = 2;
    int maxValue = 6;
    int sum = (roll1 + roll2);
    System.out.println("Your total is: " + (sum));
  }

  public static void round() {
    int sum = (roll1 + roll2);
    if (sum == 2 || sum == 3 || sum == 12) {
      System.out.print("That's craps! You lose. ");
    } else if (sum == 7 || sum == 11) {
        System.out.print ("That's a Natural! You win. ");
      } else {
        System.out.print("Point");
  }
}
*/

// this was my first try

  public static void practice() {

    //Scanner in = new Scanner(System.in);
    //System.out.print("Would you like to roll the dice? Enter y or n. ");
    //String string = in.nextLine();
    //if (string = y) {
      int min = 1;
      int max = 6;
      int roll1 = (int)Math.floor(Math.random()*(max-min+1)+min);
      System.out.println("Your first roll is: " + roll1);
      int roll2 = (int)Math.floor(Math.random()*(max-min+1)+min);
      System.out.println("Yout second roll is: " + roll2);
      int sum = (roll1 + roll2);
      System.out.println("Your total is: " + (sum));
      if (sum == 2 || sum == 3 || sum == 12) {
        System.out.print("That's craps! You lose. ");
      } else if (sum == 7 || sum == 11) {
          System.out.print ("That's a Natural! You win. ");
        } else {
          System.out.println("Point");
        }
    //}
    //else if (string = n) {
      //System.out.print("Good bye.");
    //}
    }


}
