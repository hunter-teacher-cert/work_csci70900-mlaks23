public class Time {

  public static void main(String[] args) {

    int hour = 22;
    int minute = 11;
    int second = 45;
    final int MIN_PER_HOUR = 60;
    final int SEC_PER_MIN = 60;
    int beginTime = 21 * MIN_PER_HOUR * SEC_PER_MIN + 32 * SEC_PER_MIN + 45;
    int timeElapsed = hour * MIN_PER_HOUR * SEC_PER_MIN + minute * SEC_PER_MIN + 45 - beginTime;
    //int sinceMidnight = hour * 60 * 60 + minute * 60 + second;

//I started writng the program at 21:32:45.

    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.print(":");
    System.out.print(second);
    System.out.println(".");

    System.out.print("Time elapsed since I began working on this program: ");
    System.out.println(timeElapsed);
    System.out.println(" seconds ");

    System.out.print("I have been working for ");
    System.out.print(timeElapsed / SEC_PER_MIN);
    System.out.println(" minutes.");


    //System.out.print("Number of seconds since midnight: ");
    //System.out.println(sinceMidnight);

    //System.out.print("Number of seconds remaining in day: ");
    //System.out.println(86400 - sinceMidnight);

    //System.out.print("Percentage of day that has passed: ");
    //System.out.println(sinceMidnight * 100 / 86400);
  }
}
