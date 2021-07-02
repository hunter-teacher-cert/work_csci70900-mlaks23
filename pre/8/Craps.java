//Work in Progress

import java.util.Scanner;
import java.util.Random;

public class Craps {

  public static void main (String[] args) {
    //roll();
    //shoot();
    round();
    //practice();
  }


  public static int roll() {
    int min = 1;
    int max = 6;
    int roll = (int)Math.floor(Math.random()*(max-min+1)+min);
    System.out.println("Your roll is: " + roll);
    return roll;

  }

  public static void shoot() {
    Scanner in = new Scanner(System.in);
    System.out.print("How many dice would you like to roll? ");
    int dice = in.nextInt();
    int roll = 0;
    int sum = 5;   //int sum = 0 (putting in specific values until I figure out how to get the sum)

    for (int i = 1; i <= dice; i++) {    //roll "dice" times
      roll = i * roll();
    }
    //Add a for loop for the sum of the dice- How to do this?
    //for (int j = 1; j <= dice; j++) {
      //sum = j + roll;
        //}

    System.out.println("Your total is: " + sum);
  }


  public static void round() {
    int sum = 5; //How do I link this sum to the sum in the shoot method? 5 is just a place holder.
    shoot();
    if (sum == 2 || sum == 3 || sum == 12) {
      System.out.print("That's craps! You lose. ");
    } else if (sum == 7 || sum == 11) {
        System.out.print ("That's a Natural! You win. ");
      } else {
        System.out.println("Your sum of " + sum + " is the point. Roll again.");
          //shoot();  //only runs once. How to make it continue through to round again?
          //round(); //keeps looping, never ends. How to make it stop if sum = point?
        }

    }
  }




// this was my first try in order to understand the rules and how the game works
/*
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
      System.out.println("Your total is: " + sum);
      if (sum == 2 || sum == 3 || sum == 12) {
        System.out.print("That's craps! You lose. ");
      } else if (sum == 7 || sum == 11) {
          System.out.print ("That's a Natural! You win. ");
        } else {
          System.out.println("Your sum of " + sum + " is the point. Roll again.");
          int point = sum;
          int roll3 = (int)Math.floor(Math.random()*(max-min+1)+min);
          System.out.println("Your first roll is: " + roll3);
          int roll4 = (int)Math.floor(Math.random()*(max-min+1)+min);
          System.out.println("Yout second roll is: " + roll4);
          int sumNew = (roll3 + roll4);
          System.out.println("Your total is: " + sumNew);
          if (sumNew == sum) {
            System.out.println("You win!");
          } else if (sumNew == 7) {
            System.out.print ("You lose!");
          } else {
            System.out.println("Roll again.");
          }
        }
    //}
    //else if (string = n) {
      //System.out.print("Good bye.");
    //}
    }
    */
