import java.util.Scanner;

public class Methods {

public static boolean isDivisible (int n, int m) {
  System.out.println("n dividided by m has a remainder of " + (n % m));
  if ( n % m == 0 ) {
      System.out.println("n is divisible by m.");
      return true;
  } else {
      System.out.println("n is not divisible by m.");
      return false;
  }
}




public static boolean isTriangle (int n, int m, int o) {
  int sum1 = n + m;
  int sum2 = m + o;
  int sum3 = n + o;
  if (sum1 > o && sum2 > n && sum3 > m) {
    System.out.println("side n + m = " + sum1);
    System.out.println("side m + o = " + sum2);
    System.out.println("side n + o = " + sum3);
    System.out.println("These sticks will form a triangle.");
    return true;
  } else {
    System.out.println("side n + m = " + sum1);
    System.out.println("side m + o = " + sum2);
    System.out.println("side n + o = " + sum3);
    System.out.println("These sticks will not form a triangle. ");
    return false;
  }
}

public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("You have three sticks with integer lengths n, m, and o. Check to see if the sticks will form a triangle.");
  System.out.print("Enter side length n: ");
  int n = in.nextInt();
  System.out.print("Enter side length m: ");
  int m = in.nextInt();
  System.out.print("Enter side length o: ");
  int o = in.nextInt();
  System.out.println();
  isDivisible(n, m);
  System.out.println();
  isTriangle(n, m, o);
}
}
