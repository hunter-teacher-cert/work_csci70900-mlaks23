//Collaborators: mlaks23	leungbenson	MichCS
//Consultant: Ian Scheffler
// GOAL: Gain familiarity with basics of classes in Java.


import java.io.*;
import java.util.*;

public class Driver {

  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t;

    //assign var the address of a newly-apportioned Time object
    //instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    t = new Time();
    System.out.print("Default time = ");
    t.printTime(t); //Print default values


    //instantiate a newly-created Time object with specified value(s)
    t = new Time(13,51,30.2);
    System.out.print("Specified time = ");
    t.printTime(t); //Print specified values

    //assign a Time var the value null
    Time var = null;

    //assign a Time var the value of an existing Time var
    var = t;
    System.out.print("This is no longer null. The time is now: ");
    t.printTime(t);



    //test for equality of each of the Time instances above. Print results.

    t.checkTime(t, var); //same time (t and var are same)

    t = new Time(12,50,30.2); //change t
    t.checkTime(t, var); //different time (t and var are different)


    //add two Time objects and print results


    Time t1 = new Time(9,20,25.1); //start time
    Time t2 = new Time(9,45,35.2); //finished time

    Time endTime = Time.add(t1, t2); //added start and finished time
    t.printTime(endTime);

    //add two Time objects and save the result in another Time object

    Time tSum = endTime;
    t.printTime(tSum);

  }//end main()


}//end class
