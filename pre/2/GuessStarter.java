import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

  public static void main(String[] args) {
    int yourNumber;
    Scanner in = new Scanner(System.in);

    System.out.println("I'm thinking of a number between 1 and 100, inclusive. Can you guess what it is?");
    System.out.print("Type a number: ");
    yourNumber = in.nextInt();

    System.out.print("Your guess is: ");
    System.out.println(yourNumber);


    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.print("The number I was thinking of is: ");
    System.out.println(number);

    System.out.print("You were off by: ");
    System.out.println(yourNumber - number);






  }

}
