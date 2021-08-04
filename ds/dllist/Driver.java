import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

    System.out.println("DLlist");
    System.out.println("-----------");

    DLlist dll = new DLlist();
    System.out.println(dll);

    System.out.println("testing isEmpty()");
    System.out.println(dll.isEmpty() + "\n");

    System.out.println("testing length()");
    System.out.println("length " + dll.length() + "\n");

    System.out.println("testing addFront()");
    dll.addFront("c");
    dll.addFront("b");
    dll.addFront("a");
    System.out.println(dll);
    System.out.println("length: " + dll.length() + "\n");


    dll.addEnd("d");
    System.out.println("Testing addEnd('d')");
    System.out.print(dll + "\n");
    System.out.println("length: " + dll.length() + "\n");

    System.out.println("Testing get(1)");
    System.out.println(dll.get(1) + "\n");

    System.out.println("Testing set(1, 'm')");
    dll.set(1, "m");
    System.out.println(dll + "\n");


    System.out.println("Testing insert(2, 'x')");
    dll.insert(2, "x");
    System.out.println(dll);
    System.out.println("length: " + dll.length() + "\n");


    System.out.println("Testing search('x')");
    dll.search("x");
    System.out.println("Testing search('r')");
    dll.search("r");
    System.out.println();



    System.out.println("Testing remove(4)");
    dll.remove(4);
    System.out.println(dll);


  }
}
