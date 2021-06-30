import java.util.Scanner;

public class Loops {
  public static void power(double x, int n) {
    System.out.print(x + " raised to the power of " + n + " is: ");
    double result = x;
    if (n == 0) {
      result = 1;
    } else {
      for (int i = 1; i < n; i++) {
        result = x * result;
      }
    }

    System.out.print(result);
  }

  public static void factorial(int n) {
    System.out.print(n + "! is ");
    int result = 1;
    if (n == 0) {
      result = 1;
    } else {
      for (int i = n; i > 1; i = i - 1) {
        result = i * result;
      }
    }
    System.out.println(result);
  }







  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Choose a number x: ");
    double x = in.nextDouble();
    System.out.print("Choose a number n: ");
    int n = in.nextInt();
    factorial(n);
    power(x, n);
  }

}
