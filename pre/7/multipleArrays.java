import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class multipleArrays {

  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("How many elements in your array? ");
    int n = in.nextInt();


    double[] random = new double[n];
    double[] s = new double[n];
    double[] choice = new double[n];


    System.out.print("What power do you want? ");
    int m = in.nextInt();

    randomArray(random, n, m);
    nArray(s, n, m);
    chooseArray(choice, n, m);
  }


  public static void randomArray(double[] a, int n, int m) {
    double[] random = new double[n + 1];
    int min = 0;
    int max = 100;
    for (int i = 0; i < random.length; i++) {
      random[i] = Math.floor(Math.random()*(max-min+1)+min);
    }
    System.out.println("Here is your random array: ");
    printArray(random, n);
    powArray(random, n, m);
  }



  public static void nArray(double[] a, int n, int m) {
    double[] s = new double [n + 1];
    for (int i = 1; i < s.length; i++) {
        s[i] = i;
    }


    System.out.println("This is an array with " + n + " elements from 1 to " + n + ". ");
    printArray(s, n);
    powArray(s, n, m);
    }


    public static void chooseArray(double[] a, int n, int m) {
      Scanner in = new Scanner(System.in);
      double[] choice = new double [n + 1];
      for (int i = 0; i < n; i++) {
        choice[i] = i;
      }
      for (int i = 1; i < choice.length; i++) {
        System.out.print("What is element " + i + "? ");
        int element = in.nextInt();
        choice[i] = element;
      }
      System.out.println("This is an array with your elements. ");
      printArray(choice, n);
      powArray(choice, n, m);
      }



    public static void printArray(double[] a, int n){
      System.out.print(" {");
      for (int i = 1; i < a.length; i++) {
        System.out.print(a[i] + "  ");
      }
      System.out.println("}");
    }


  public static void powArray(double[] s, int n, int m) {
    double[] newS = new double[n];
    for (int i = 0; i < n; i++) {
      newS[i] = s[i];
    }
    System.out.println("Here is your array to the power of " + m + ". ");
    System.out.print(" {");
    for (int i = 1; i < s.length; i++) {
      s[i] = Math.pow(s[i], m);
      System.out.print(s[i] + "  ");
    }
    System.out.println("}");
    }
  }
