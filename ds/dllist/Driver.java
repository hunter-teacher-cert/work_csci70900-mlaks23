import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

    System.out.println("DLlist");
    System.out.println("-----------");

    DLlist dll = new DLlist();
    System.out.println(dll);
/*
    System.out.println("testing isEmpty()");
    System.out.println(dll.isEmpty());
    System.out.println();

    System.out.println("testing length()");
    System.out.println("length " + dll.length()); //return 0
*/

    dll.addFront("c");
    dll.addFront("b");
    dll.addFront("a");
    System.out.println(dll);
    System.out.println("length: " + dll.length()); //return 3
    System.out.println();


    dll.addEnd("d");
    System.out.print(dll + "\n");
    System.out.println("length: " + dll.length()); //return 4

/*

    //System.out.println("We should see b on the next line");
    //System.out.println(dll.get(1));  //print b

    System.out.println("Testing set()");
    dll.set(1, "new");
    System.out.println(dll);
*/

    System.out.println("Testing insert()");
    dll.insert(3, "x");   //If i insert at 0 or End, there's a null pointer exception.
    System.out.println(dll);
    System.out.println("length: " + dll.length());

/*

    System.out.println("Testing search()");
    dll.search("x");
    System.out.println();
    dll.search("m");

*/

    System.out.println("Testing remove()");
    dll.remove(1);
    System.out.println(dll);


  }
}
