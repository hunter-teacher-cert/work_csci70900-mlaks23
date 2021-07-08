//Collaborators: mlaks23	leungbenson	MichCS
//Consultant: Ian Scheffler - Ian helped me understand what goes in Time and Driver
// GOAL: Gain familiarity with basics of classes in Java.

import java.io.*;
import java.util.*;


/*Your driver file should contain code to (in suggested development order)


assign a Time var the value null
assign a Time var the value of an existing Time var
print all of the above (See multiple ways to do this? Try all -- and document in comments!)
test for equality of each of the Time instances above. Print results.
add two Time objects and print results
add two Time objects and save the result in another Time object
Your Time class definition file should contain code to
tell a Time object how to do the tasks necessary to achieve the above */


  // your implementation of class Time here

public class Time {
    private int hour;
    private int minute;
    private double second;

    //instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }//end of public Time()

//instantiate a newly-created Time object with specified value(s)
/*
        this.hour = 13;
        this.minute = 51;
        this.second = 30.2;
        */

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }//end of public Time

public int getHour() {
  return this.hour;
}

public int getMinute() {
  return this.hour;
}

public int getSecond() {
  return this.hour;
}

//Method to print time
  public static void printTime(Time t) {

    System.out.printf("%02d:%02d:%04.1f\n",
        t.hour, t.minute, t.second);
  }//end of printTime Method

  //Testing for equality (attributes) of the Time instance
    public static void checkTime(Time t, Time var){
      System.out.print("Time t is: " );
      printTime(t);
      System.out.print(" and time var is: " );
      printTime(var);
      if (t.hour == var.hour && t.minute == var.minute && t.second == var.second){
        System.out.println("Time t and time var are the same.");
      }
      else{
        System.out.println("Time t and time var are different.");
      }
    }



      //Adding two Time objects
      public static Time add(Time t1, Time t2) {
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;

        if (sum.second >= 60.0) {
          sum.second -= 60.0;
          sum.minute += 1;
        }
        if (sum.minute >= 60) {
          sum.minute -= 60;
          sum.hour += 1;
        }
        return sum;



      }//end of Time Method



}//end class Time
