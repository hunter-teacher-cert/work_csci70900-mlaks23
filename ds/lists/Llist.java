import java.io.*;
import java.util.*;


public class Llist{
  private Node front; // the front of the list

  public  Llist(){
    front = null;
  }

  // Add a new node containing data
  // at the front of the list
  public void addFront(String data){
    // make the new node
    Node newNode = new Node(data);
    // point it to what front points to
    newNode.setNext(front);
    // point front to the new node
    front = newNode;
  }

  public String toString(){
    Node currentNode;
    currentNode = front;
    String result = "";
    while (currentNode != null){
      result = result + currentNode + "->";
      // this is like i=i+1 is for arrays
      // but for linked lists
      currentNode = currentNode.getNext();
    }
    result = result + "null";
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
    if (index > this.length()){
        throw new ArithmeticException("index out of bounds");
        }
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
    currentNode.setNext(newNode);

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

  //I used Jiyoon's code as an example and made my own edits
  public void remove(int index){
    if (index > this.length()){
        throw new ArithmeticException("index out of bounds");
        }
    int i = 1;
    Node currentNode = front;
    if (index == 0) {
      currentNode.getNext();
      front = currentNode.getNext();
    }
    else if (i <= index - 1) {
          i++;
          currentNode.getNext();
          currentNode = currentNode.getNext();
        }

    Node newCurrent = new Node();
    newCurrent = (currentNode.getNext()).getNext();
    currentNode.setNext(newCurrent);
    newCurrent = currentNode;

  }


}
