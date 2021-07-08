import java.util.Scanner;

//Work in progress

public class Eratosthenes {

  public static boolean sieve(int[] a, int n) {

      System.out.println("These are the prime numbers up to 100. ");
      for (int i = 1; i < 100; i++) {
          if (i == 1) {
              System.out.print("");    //1 is not prime
          } else if ((i == 2)||(i == 3) || (i == 5) || (i == 7)) {
              System.out.print(i + ", ");  //2 is primee- How do I tell the computer a number with only 2 factors is prime?
          } else if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
              System.out.print("");
          } else if ((i % 2 != 0) || (i % 3 != 0) || (i % 5 != 0) || (i % 7 != 0)) {
              System.out.print(i + ", ");
        }
      }
      System.out.println("\n");

/*
// Trying to figure out how to check divisibility for all integers in the array by all other itegers in the arrays
// Gives error: java.lang.ArithmeticException: / by zero

      System.out.println("These are the prime numbers up to " + n + ".");

      for (int i = 2; i < n; i++) {
        for (int j = 1; j < n; j++) {
          if (s[j] % s[i] != 0) {
            System.out.print(i + "P ");
          }
        }
      }
*/

   return true;
  }


  public static void printArray(int[] a, int n) {
    int [] s = new int [n];
      for (int i = 1; i < n; i++) {
        s[i] = i;
      }
    System.out.print(" {");
    for (int i = 1; i < s.length; i++) {
      System.out.print(s[i] + "  ");
    }
    System.out.println("}");

  }


public static void main(String[] args) {
  System.out.println("A prime number is a number that is only divisible by 1 and itself. This program will list primes up to the number you choose. ");
  Scanner in = new Scanner(System.in);
  System.out.print("Choose a number n: ");
  int n = in.nextInt();
  int [] s = new int [n];
  printArray(s, n);
  sieve(s, n);
}

}
