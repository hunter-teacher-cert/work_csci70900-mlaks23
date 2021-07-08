import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Histogram{

  public static int[] randomArray(int n) {
    Random random = new Random();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(n);
    }
    System.out.println("Here is your array: ");
    System.out.print(" {");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "  ");
    }
    System.out.println("}" + "\n");
    return a;
  }

  public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= low && a[i] < high) {
        count++;
      }
    }
    System.out.print("scores from " + low + " to " + high + ": " + count + "\n");
    return count;
  }

  public static void numScores (int[] s, int n) {
    int[] scores = randomArray(n);
    int a = inRange(scores, 90, 100);
    int b = inRange(scores, 80, 90);
    int c = inRange(scores, 70, 80);
    int d = inRange(scores, 60, 70);
    int e = inRange(scores, 0, 60);

    System.out.println("\n");

    int[] counts = new int [n];
    for (int i = 0; i < counts.length; i++) {
      counts[i] = scores[i];
    }
    for (int i = 0; i < counts.length; i++) {
      counts[i] = inRange(counts, i, i + 1);
    }
  }


  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("How many elements are in your array? ");
    int n = in.nextInt();

    int [] scores = new int[n];

    numScores(scores, n);
  }

}
