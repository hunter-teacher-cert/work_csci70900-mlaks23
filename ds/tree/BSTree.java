import java.io.*;
import java.util.*;

public class BSTree {
  private TreeNode root;

  public BSTree(){
    root = null;
  }

  public void delete(int key){
    if (root == null) { //if tree is empty, nothing to delete
      return;
    }

    //find the node we want to delete and the node above it using piggybacking
   //from insert
    TreeNode front = root;
    TreeNode trailer = root;

    //do the piggyback loop until find the node or null, if no key
    while(front != null && front.getData() != key){
      if (front.getData() < key) {
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
  }
  //if key wasn't in the tree
    if (front == null) {
      System.out.println("Key is not in tree. Cannot delete.");
      return;
    }

    //here- front points to node we want to delete and trailer points above
    //case 1- node is leaf (no children)
    if (front.getLeft() == null && front.getRight() == null) {
      if (front.getData() < trailer.getData()) {
        front = null;
        trailer.setLeft(null);
      } else if (front.getData() > trailer.getData()) {
        front = null;
        trailer.setRight(null);
      }
      System.out.println(key + " deleted");


      //repoint front parent to null
    } else if (true) {  //replace true with condition
      //case 2- check to see if front has one child
      //repoint front parent to front child
    } else { //case 3 - front has two children
      //find the node with the largest value on fronts left subtree, replace front with it
    }
  } //end of delete




  public int search(int key) {
    TreeNode current = root; //change modifier to final where possible
    while(current != null){
      int currentValue = current.getData();
      if (currentValue == key) {
        return currentValue;
      } else if (currentValue < key) {
        current = current.getRight();
      } else {
        current = current.getLeft();
      }
    } //end of while loop
    throw new NullPointerException();
    //return -1; //why return statement not needed?
  }// end of search


  private void preorderTraverse (TreeNode current) {
    if (current == null) {
      return;
    }
    //process the current node at the beginning
    System.out.print(current.getData() + ", ");

    //recursively print out left subtree
    preorderTraverse(current.getLeft());
    //recursively print out right subtree
    preorderTraverse(current.getRight());
  }

  public void preorderTraverse() {
    preorderTraverse(root);
    System.out.println();
  }

  private void postorderTraverse (TreeNode current) {
    if (current == null) {
      return;
    }
    //recursively print out left subtree
    postorderTraverse(current.getLeft());
    //recursively print out right subtree
    postorderTraverse(current.getRight());
    //process the current node at the end
    System.out.print(current.getData() + ", ");

  }

  public void postorderTraverse() {
    postorderTraverse(root);
    System.out.println();
  }

  private void inorderTraverse (TreeNode current) {
    if (current == null) {
      return;
    }
    //recursively print out left subtree
    inorderTraverse(current.getLeft());
    //process the current node
    System.out.print(current.getData() + ", "); //process the current node in middle, sorts data
    //recursively print out right subtree
    inorderTraverse(current.getRight());
  }

  public void inorderTraverse() {
    inorderTraverse(root);
    System.out.println();
  }

  public void insert(int key) {
    TreeNode newNode = new TreeNode(key);
    if (root == null) { //If tree is empty, insert new node
      root = newNode;
      return;
    }

    TreeNode front = root;
    TreeNode trailer = root;

    while(front != null){
      int frontValue = front.getData();
      if (frontValue == key) { //The key is in the tree already
        return;
      } else if (frontValue < key) {
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
    } //end of while loop
    //front points to null, but trailer points to the node  that's before where the new node goes
    //add the code to finish the insertion
    if (key > trailer.getData()) {
      trailer.setRight(newNode); //inserts on right
    } else {
      trailer.setLeft(newNode); //inserts on left
    }
  }// end of search


  public void seed(){
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight( new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);
  }

}
