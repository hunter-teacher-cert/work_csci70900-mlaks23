import java.io.*;
import java.util.*;

public class Node {

    private String data;
    private Node next;
    private Node prev;

    public Node() {
	     data = "";
	     next = null;
       prev = null;
    }//default constructor

    public Node(String value) {
	     data = value;
	      next = null;
        prev = null;
    }//constructor(value)

    public Node(String value, Node next, Node prev) {
      data = value;
      this.next = next;
      this.prev = prev;
    }

    public void setData(String value) {
	     data = value;
    }//setData

    public void setNext(Node n) {
	     next = n;
    }//setNext

    public void setPrev(Node n) {
      prev = n;
    }//set prev

    public String getData() {
	     return data;
    }//end getValue

    public Node getNext() {
	     return next;
    }//getNext

    public Node getPrev() {
      return prev;
    }//getPrev

    public String toString() {
	     return data;
    }//toString
    public void printWholeList(){
      Node temp = this;
      while (temp!=null){
        System.out.print(temp+"->");
        temp = temp.getNext();
      }
      System.out.println("Null");
    }
}//class Node
