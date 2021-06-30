import java.util.Scanner;
import java.util.Random;

public class Arrays {

  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("How many elements in your array? ");
    int n = in.nextInt();
    System.out.print("What power do you want? ");
    int m = in.nextInt();
    double[] a = new double[n];
    double[] b = new double[n];
    int min = 0;
    int max = 100;
    for (int i = 0; i < n; i++) {
      a[i] = Math.floor(Math.random()*(max-min+1)+min);
    }
    powArray(a, m, n);
  }

  public static void powArray(double[] a, int m, int n) {
    double[] b = new double[n];
    for (int i = 0; i < n; i++) {
      b[i] = a[i];
    }
    System.out.println("Here is your array: ");
    System.out.print(" {");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "  ");
    }
    System.out.println("}");


    System.out.println("Here is your array to the power of 2: ");
    System.out.print(" {");
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i], 2.0);
      System.out.print(a[i] + "  ");
    }
    System.out.println("}");


    System.out.println("Here is your array to the power of: " + m);
    System.out.print(" {");
    for (int j = 0; j < b.length; j++) {
      b[j] = Math.pow(b[j], m);
      System.out.print(b[j] + "  ");
    }
    System.out.println("}");
  }
  }
