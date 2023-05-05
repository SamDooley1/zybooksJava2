/*
Given the MileageTrackerNode class, complete main() in the MileageTrackerLinkedList class to 
insert nodes into a linked list (using the insertAfter() method). The first user-input value 
is the number of nodes in the linked list. Use the printNodeData() method to print the entire 
linked list. DO NOT print the dummy head node.

Ex. If the input is:

3
2.2
7/2/18
3.2
7/7/18
4.5
7/16/18
the output is:

2.2, 7/2/18
3.2, 7/7/18
4.5, 7/16/18
*/

import java.util.Scanner;

public class MileageTrackerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;
      int nodeNum;

      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode();
      lastNode = headNode;

      // TODO: Scan the number of nodes
      nodeNum = scnr.nextInt();
         
      // TODO: For the scanned number of nodes, scan
      //       in data and insert into the linked list
      for (i = 0; i < nodeNum; i++) {
         miles = scnr.nextDouble();
         date = scnr.next();
         currNode = new MileageTrackerNode(miles, date);
         lastNode.insertAfter(currNode);
         lastNode = currNode;
      }
            

      // TODO: Call the printNodeData() method 
      //       to print the entire linked list
      currNode = headNode.getNext();
      while (currNode != null) {
         currNode.printNodeData();
         currNode = currNode.getNext();
      }
            
   }
}
