import java.util.Scanner;
import java.util.Random;

public class indexOfMax {

  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("How many elements in your array? ");
    int n = in.nextInt();
    double[] a = new double[n];
    int min = 0;
    int max = 100;
    for (int i = 0; i < n; i++) {
      a[i] = Math.floor(Math.random()*(max-min+1)+min);
    }
    array(a, n);
    double large = a[0];
    double target = largest(a, large);
    System.out.print("The largest number is: ");
    System.out.println(largest(a, large));
    System.out.print("The index of the largest nubmer is: ");
    System.out.print(search(a, target));
  }

  public static int search(double[] a, double target) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static double largest(double[] a, double large) {
    int i;
    for (i = 0; i < a.length; i++)
      if (a[i] > large)
        large = a[i];
    return large;
  }


  public static void array(double[] a, int n) {
    System.out.println("Here is your array: ");
    System.out.print(" {");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "  ");
    }
    System.out.println("}");

  }

}
