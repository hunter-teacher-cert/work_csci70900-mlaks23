import java.util.Scanner;

public class livecode {

//have the method statment written before the live coding starts
public static boolean isTriangle (int n, int m, int o) {
//Why do we use a boolean method here?

//What are the conditions we need for the sticks to form a triangle?

  int sum1 = n + m;
  int sum2 = m + o;
  int sum3 = n + o;

  if (sum1 > o && sum2 > n && sum3 > m) {
//What statements will help show the user what the code is doing?
    System.out.println("side n + m = " + sum1);
    System.out.println("side m + o = " + sum2);
    System.out.println("side n + o = " + sum3);

    System.out.println("These sticks will form a triangle.");

//Ask the students what else we need? See if they know the return statement is needed.
    //return true;
  } else {

    System.out.println("side n + m = " + sum1);
    System.out.println("side m + o = " + sum2);
    System.out.println("side n + o = " + sum3);
    System.out.println("These sticks will not form a triangle. ");

    return false;

  }
}

//Start here
public static void main (String[] args) {
  System.out.println("You have three sticks with integer lengths n, m, and o. Check to see if the sticks will form a triangle.");

  //How do we ask the user for side lengths?
  Scanner in = new Scanner(System.in);

  System.out.print("Enter side length n: ");
  int n = in.nextInt();
  System.out.print("Enter side length m: ");
  int m = in.nextInt();
  System.out.print("Enter side length o: ");
  int o = in.nextInt();
  System.out.println();

  isTriangle(n, m, o);
}
}
