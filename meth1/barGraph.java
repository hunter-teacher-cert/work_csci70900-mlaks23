//Marisa Laks and Tiffany Wong
import java.util.Scanner;
import java.util.Random;

public class barGraph{

  public static void barGraphify(double[] array){

    for (int i = 0; i < array.length; i++) { //loops as many times as array is long
    System.out.println(i + ": " + printEquals(i, array));
    }
  }

  public static String printEquals(int index, double[] array) {
    String s = "  "; //start string with no equals signs
    for (int i = 0; i < array[index]; i++) {
      s = s + "="; //add as many equals signs as value at the index
    }
    return s;

  }


  public static void main (String[] args){
    //int[] array = {1,0,3,2,5};

    Scanner in = new Scanner(System.in);
    System.out.print("How many elements in your array? ");
    int n = in.nextInt();

    double[] array = new double[n];
    int min = 0;
    int max = 10;
    for (int i = 0; i < n; i++) {
      array[i] = Math.floor(Math.random()*(max-min+1)+min);
    }

    System.out.print(" {");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + "  ");
    }
    System.out.println("}");




    barGraphify(array);


  } //end main


} //end class
