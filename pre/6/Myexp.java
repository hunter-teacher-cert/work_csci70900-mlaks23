import java.util.Scanner;

public class Myexp {

  public static void myexp(double x, int n) {
    System.out.print("e to the power of " + x + " is approximately ");
    double result = powerFact(x, n);
    System.out.println(result);
  }

  public static double powerFact(double x, int n) {
    double sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + (power(x, i)/factorial(i));
    }
    return sum;
  }


  public static double power(double x, int n) {
    if (n == 0) {
      return(1);
    } else if (n == 1) {
      return(x);
    } else if (n == 2) {
      return(x * x);
    } else if (n > 2); {
      return (x * power(x, (n - 1)));
    }
  }

  public static int factorial(int n) {
    if (n == 0) {
      return(1);
    } else if (n == 1) {
      return(n);
    } else if (n > 1); {
      return(n * factorial(n - 1));
    }
  }


  public static void check(double x, int n) {
    //when x is larger and n is large, the results are not as accurate
    System.out.print("Check: ");
    System.out.print(x + "   ");
    System.out.print(powerFact(x, n) + "   ");
    System.out.print(Math.exp(x) + " ");
  }

  public static void main (String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Choose a number x: ");
    int x = in.nextInt();
    System.out.print("Choose a number n: ");
    int n = in.nextInt();
    myexp(x, n);
    check(x, n);

  }

}
