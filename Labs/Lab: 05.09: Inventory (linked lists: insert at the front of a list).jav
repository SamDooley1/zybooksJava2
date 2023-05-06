/*
Given main() in the Inventory class, define an insertAtFront() method in the InventoryNode 
class that inserts items at the front of a linked list (after the dummy head node).

Ex. If the input is:

4
plates 100
spoons 200
cups 150
forks 200
the output is:

200 forks
150 cups
200 spoons
100 plates
*/

public class InventoryNode {
   private String item; 
   private int numberOfItems;
   private InventoryNode nextNodeRef; // Reference to the next node                                   

   public InventoryNode() {
      item = "";
      numberOfItems = 0;
      nextNodeRef = null;
   }

   // Constructor                                                                                     
   public InventoryNode(String itemInit, int numberOfItemsInit) {
      this.item = itemInit;
      this.numberOfItems = numberOfItemsInit;
      this.nextNodeRef = null;
   }

   // Constructor                                                                                     
   public InventoryNode(String itemInit, int numberOfItemsInit, InventoryNode nextLoc) {
      this.item = itemInit;
      this.numberOfItems = numberOfItemsInit;
      this.nextNodeRef = nextLoc;
   }

   // TODO: Define an insertAtFront() method that inserts a node at the 
   //        front of the linked list (after the dummy head node)
   public void insertAtFront(InventoryNode headNode, InventoryNode currNode) {
      currNode.nextNodeRef = headNode.nextNodeRef;    
      headNode.nextNodeRef = currNode;
   }
   

   // Get location pointed by nextNodeRef                                                             
   public InventoryNode getNext() {
      return this.nextNodeRef;
   }
   
   // Print node data
   public void printNodeData() {
      System.out.println(this.numberOfItems + " " + this.item);
   }
}
