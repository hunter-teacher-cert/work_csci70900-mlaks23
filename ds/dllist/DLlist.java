import java.io.*;
import java.util.*;


public class DLlist{
  private Node front; // the front of the list
  private Node back;


  public  DLlist(){
    front = null;
    back = null;
  }

  // Add a new node containing data
  // at the front of the list
  public void addFront(String data){
    // make the new node
    Node newNode = new Node(data);

    if (front == null) {
      front = newNode;
      front = back = newNode;
      front.setPrev(null);
      back.setNext(null);

    } else if (front != null) {
      front.setPrev(newNode);
      newNode.setNext(front);
      front = newNode;
      front.setPrev(null);

    }
  }


  public String toString(){
    Node currentNode;
    currentNode = front;
    String result = "";
    while (currentNode != null){
      result = result + currentNode + "->";
      currentNode = currentNode.getNext();
    }
    result = result + "\n";


    currentNode = back;
    while (currentNode != null){
      result = result + currentNode + "<-";
      currentNode = currentNode.getPrev();
    }
    return result;

  }

  // returns True if there is nothing in the list
  // False otherwise
  public boolean isEmpty(){
    if (front == null) {
       return true;
     } else {
       return false;
     }
  }

  // returns the number of items in the list
  // Hint: look at the toString
  // to remind you how to traverse down the list
  public int length(){
    int size = 0;
    Node currentNode = front;

    while(currentNode != null){
          size++; //everytime we reach a new node, size goes up by 1
          currentNode.getNext();
          currentNode = currentNode.getNext(); //reassign currentNode to the next one
        }
  	return size;
  }

  // returns the item at location index;
  // returns null if there aren't enough
  // items. Starts with index 0
  public String get(int index){
    if (index > this.length()){
      throw new ArithmeticException("index out of bounds");
      //new error message. better b/c exits when index > length
    }
    int i = 0;
    Node currentNode = front;
    while(i != index) {
      i++;
        //everytime we reach a new node, size goes up by 1
      currentNode.getNext();
      currentNode = currentNode.getNext();
    }
	  return currentNode.getData();
  }


  // sets the item at location index (starting
  // with 0) to value.
  // only sets if the index is within range
  public void set(int index, String value){
    if (index > this.length()){
      throw new ArithmeticException("index out of bounds");
       //new error message. better b/c exits when index > length
       }
       int i = 0;
       Node currentNode = front;
       while(i != index) {
         i++;
           //everytime we reach a new node, size goes up by 1
         currentNode.getNext();
         currentNode = currentNode.getNext();
       }
       currentNode.setData(value);
  }

  // insert an item before index.
  // only inserts if the index is within bounds
  // Hint: look at toString for hints on
  // traversal and draw out a diagram.
  // You will need a variable that refers to
  // the node BEFORE you want to do the insertion.
  public void insert(int index, String value){
    if (index == this.length() - 1) {
        addEnd(value);
    } else if (index == 0) {
        addFront(value);
        System.out.println("hi");
    } else {
    int i = 0;
    Node currentNode = front;
    while(i != index - 1) {
          i++;
          currentNode.getNext();
          currentNode = currentNode.getNext();
        }
    Node newNode = new Node(value);
    Node postNode = currentNode.getNext();

    newNode.setNext(postNode);
    newNode.setPrev(currentNode);
    currentNode.setNext(newNode);
    postNode.setPrev(newNode);

    }
  }
//add to end
  public void addEnd(String value) {
    Node newNode = new Node(value);
    if (front == null) {
      front = newNode;
    } else {
      Node currentNode = front;
      while(currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(newNode);
      newNode.setPrev(currentNode);
      back = newNode;
    }
  }



  // returns the index of the first item with
  // data value key. Returns -1 if not found
  public int search(String key){
    int i = 0;
    Node currentNode = front;
    while(i < this.length()) {
          String val = currentNode.getData();
          if (val == key) {
            System.out.println("Your key of " + key + " is in node " + i + ". ");
            return i;
          }
          i++;
          currentNode = currentNode.getNext();
        }
    System.out.println("Your key of " + key + " is not in the list. ");
    return -1;
  }

  // removes the node at index.
  // does nothing if index out of bounds


  public void remove(int index){
    if (index > this.length()){
        throw new ArithmeticException("index out of bounds");
        }
    Node currentNode = front;
    if (index == 0) {
      front = currentNode.getNext();
      front.setPrev(null);

    } else if (index == this.length() - 1) {
      currentNode = back;
      back = currentNode.getPrev();
      back.setNext(null);



    } else {
        int i = 0;
        while (i != index) {
            currentNode = currentNode.getNext();
            i++;
          }
       currentNode.getPrev().setNext(currentNode.getNext());
       currentNode.getNext().setPrev(currentNode.getPrev());
    } //end of else
  }
}
