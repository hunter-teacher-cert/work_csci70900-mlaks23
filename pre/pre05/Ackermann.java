import java.util.Scanner;

public class Ackermann {
  public static int Ack (int m, int n) {
    if (m == 0) {
        return (n + 1);
    } else if (m > 0 && n == 0) {
        return Ack((m - 1), 1);
    } else if (m > 0 && n > 0);
        return Ack((m - 1), Ack(m, (n - 1)));
  }
public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a number m: ");
  int m = in.nextInt();
  System.out.print("Enter a number n: ");
  int n = in.nextInt();
  Ack(m, n);
  System.out.println(Ack(m,n));
}
}
