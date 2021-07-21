//ds/sort1/SortDemoDriver.java
//Collaborators: mlaks23	twong-cs	Skabanakis leungbenson	MichCS

//consultant: tiffany

import java.io.*;
import java.util.*;

public class SortDemoDriver {
  public static void main(String[] args) {
//default constructor limited to 15
	SortDemo sd = new SortDemo();
  
  System.out.println("Here is your array: ");
	System.out.println(sd);

  /*
//constructor with the int
  System.out.println("Here is your larger array: ");
	SortDemo sd2 = new SortDemo(30);
	System.out.println(sd2);

	// part 2 test lines

	 int i;
	i = sd2.findSmallestIndex(0);
  //System.out.println(i);  //check to see if the program returns the index of the smallest number
  //System.out.println("sd["+ i + "] = "+sd.get(i));
  System.out.println("The smallest value " + sd2.get(i) + " is at index " + i + " . ");
	//i = sd2.findSmallestIndex(0);
   //System.out.println(i);
	 //System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);

*/
   	//part 3 test lines

	  //System.out.println(sd);
	  sd.sort();
    System.out.print("Here is your selection sorted array: ");
	  System.out.println(sd);

/*
    // Linear search
    System.out.print("This is a linear search. ");
    i = sd2.linearSearch(9);

    //binary search
    System.out.print("This is a binary search. ");
    i = sd2.binarySearch(10);


    sd.testMerge();
*/
    //System.out.println(sd);
	  sd.msortTest();
    System.out.print("Here is your merge sorted array: ");
	  System.out.println(sd);
    }



}
