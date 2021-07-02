import java.util.Scanner;

//Work in progress

public class Eratosthenes {

  public static boolean sieve(int[] a, int n) {
    //int n = 0;
    for (int i = 1; i < n; i++) {
      if (i == 1) {
        System.out.print(i + "NP, ");    //1 is not prime
      } else if (i % 2 != 0) {          //Working on a way check divisibility by other numbers
        System.out.print(i + " P,");
      } else if (i % 2 == 0) {
        System.out.print(i + " NP,");
      }
    }
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
  Scanner in = new Scanner(System.in);
  System.out.print("Choose a number n: ");
  int n = in.nextInt();
  int [] s = new int [n];
  printArray(s, n);
  sieve(s, n);
}

}
