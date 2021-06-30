import java.util.scanner;

//This does not work. I'm still trying to figure it out.

public class Eratosthenese {

  public static boolean sieve(int x, int n) {
    //for (i = 0; i < n; i++) {
      if (x % 2 != 0) {
        return x;
      }
      if (x % 2 = 0) {
        return false;
      }
    }
  }

  public static void Array(double[] a, int x) {
    System.out.print(" {");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "  ");
    }
    System.out.println("}");
  }



public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Choose a number n: ");
  int n = in.nextInt();
  sieve(x, n);
}

}
