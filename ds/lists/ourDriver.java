import java.io.*;
import java.util.*;

public class ourDriver{
    public static void main(String[] args) {
/*	Node n;
	n = new Node();
	n.setData("Eduardo");


	Node n2 = new Node("Brian");
	n.setNext(n2);

	System.out.println(n);

	System.out.println(n2);

	System.out.println(n.getNext());
	n.getNext().setNext(new Node("Steph"));
	System.out.println(n2.getNext());
	System.out.println(n.getNext().getNext());
*/
	Node L;
  L = new Node(); //Set value to Node 1
  L.setData("a");
  Node L2 = new Node("b");
  L.setNext(L2);
  L.getNext().setNext(new Node("c"));
  L2.getNext().setNext(new Node("d"));

  System.out.println("[" + L + ", " + L2 + ", " + L2.getNext() + ", " + L2.getNext().getNext() + "] ");

  Node LX = new Node("x");
  LX.setNext(L2.getNext());
  L2.setNext(LX);

  System.out.println("[" + L + ", " + L2 + ", " + L2.getNext() + ", " + LX.getNext() + ", " + LX.getNext().getNext() + "] ");

  LX.setNext(LX.getNext().getNext());

  System.out.println("[" + L + ", " + L2 + ", " + L2.getNext() + ", " + LX.getNext() + ", " + LX.getNext().getNext() + "] ");



	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
	// 2. Write the code to insert an "x"
	//    between the b and the c
	// 3. Write the code to delete the c


    }
}
