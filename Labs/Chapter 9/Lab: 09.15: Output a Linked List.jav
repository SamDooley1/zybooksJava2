/*
Write a recursive method called printLinkedList() that outputs the integer value of each node in a linked list. 
Method printLinkedList() has one parameter, the head node of a list. The main program reads the size of the 
linked list, followed by the values in the list. Assume the linked list has at least 1 node.

Ex: If the input of the program is:

5 1 2 3 4 5
the output of the printLinkedList() method is:

1, 2, 3, 4, 5,
Hint: Output the value of the current node, then call the printLinkedList() method repeatedly until the end of 
the list is reached. Refer to the IntNode class to explore any available member methods that can be used for 
implementing the printLinkedList() method.
*/

//LabProgram.java
import java.util.Scanner;

public class LabProgram {
   
   /* TODO: Write recursive printLinkedList() method here. */
   public static void printLinkedList(IntNode headNode) {
      if(headNode != null) {
         headNode.printData();
         printLinkedList(headNode.getNext());
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int size;
      int value;
      
      size = scnr.nextInt();
      value = scnr.nextInt();
      IntNode headNode = new IntNode(value); // Make head node as the first node
      IntNode lastNode = headNode;      // Node to add after
      IntNode newNode = null;           // Node to create
      
      // Insert the second and the rest of the nodes
      for (int n = 0; n < size - 1; ++n) {
         value = scnr.nextInt();
         newNode = new IntNode(value);
         lastNode.insertAfter(newNode);
         lastNode = newNode;
      }
      
      // Call printLinkedList() with the head node
      printLinkedList(headNode);
   }
}

//IntNode.java
public class IntNode {
   int dataVal;
   private IntNode nextNodeRef; // Reference to the next node
   
   // Constructor
   public IntNode(int value) {
      this.dataVal = value;
      this.nextNodeRef = null;
   }
   
   // Insert a new node after the current node
   public void insertAfter(IntNode nodeLoc) {
      IntNode tmpNext;
      
      tmpNext = this.nextNodeRef;
      this.nextNodeRef = nodeLoc;
      nodeLoc.nextNodeRef = tmpNext;
   }
   
   // Get location pointed by nextNodeRef
   public IntNode getNext() {
      return this.nextNodeRef;
   }
   
   // Print the node's data
   public void printData() {
      System.out.printf("%d, ", this.dataVal);
   }
}
