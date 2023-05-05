/*
Two integers, ducklings1 and ducklings2, are read from input as the number of ducklings for two ducks. 
headObj has the default value of -1. Create a new node firstDuck with integer ducklings1, and insert firstDuck after headObj. 
Then, create a second node secondDuck with integer ducklings2, and insert secondDuck after firstDuck.

Ex: If the input is 23 13, then the output is:

-1
23
13
*/

import java.util.Scanner;

public class DuckLinkedList {   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      DuckNode headObj;
      DuckNode firstDuck;
      DuckNode secondDuck;
      DuckNode currDuck;
      int ducklings1;
      int ducklings2;

      ducklings1 = scnr.nextInt();
      ducklings2 = scnr.nextInt();

      headObj = new DuckNode(-1);
   
      /* Your code goes here */
      firstDuck = new DuckNode(ducklings1);
      headObj.insertAfter(firstDuck);
      
      secondDuck = new DuckNode(ducklings2);
      firstDuck.insertAfter(secondDuck);

      currDuck = headObj;
      while (currDuck != null) {
         currDuck.printNodeData();
         currDuck = currDuck.getNext();
      }
   }
}

/*
Integer frogCount is read from input as the number of input values that follow. The node headFrog 
is created with the value of frogCount. Use scnr.nextInt() to read frogCount integers. Insert a 
FrogNode for each integer at the end of the linked list.

Ex: If the input is 3 38 24 31, then the output is:

3
38
24
31
*/

import java.util.Scanner;

public class FrogLinkedList {   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FrogNode headFrog = null;
      FrogNode currFrog = null;
      FrogNode lastFrog = null;
      int frogCount;
      int inputValue;
      int i;

      frogCount = scnr.nextInt();
   
      headFrog = new FrogNode(frogCount);
      lastFrog = headFrog;
   
      /* Your code goes here */
      for (i = 0; i < frogCount; ++i) {
         inputValue = scnr.nextInt();
         currFrog = new FrogNode(inputValue);
         lastFrog.insertAfter(currFrog);
         lastFrog = currFrog;
      }
      

      currFrog = headFrog;
      while (currFrog != null) {
         currFrog.printNodeData();
         currFrog = currFrog.getNext();
      }
   }
}

/*
Multiple integers, representing the number of babies, are read from input and inserted into a 
linked list of RabbitNodes. For each zero found in the linked list of RabbitNodes, output 
"Found a rabbit without babies." on a new line.

Ex: If the input is 3 12 0 28, then the output is:

Found a rabbit without babies.
*/

import java.util.Scanner;

public class RabbitLinkedList {   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      RabbitNode headRabbit = null;
      RabbitNode currRabbit = null;
      RabbitNode lastRabbit = null;
      int count;
      int inputValue;
      int i;
      
      count = scnr.nextInt();
   
      headRabbit = new RabbitNode(count);
      lastRabbit = headRabbit;

      for (i = 0; i < count; ++i) {
         inputValue = scnr.nextInt();
      
         currRabbit = new RabbitNode(inputValue);
      
         lastRabbit.insertAfter(currRabbit);
         lastRabbit = currRabbit;
      }

      /* Your code goes here */
      currRabbit = headRabbit.getNext();
      while (currRabbit != null) {
         if (currRabbit.getNodeData() == 0) {
            System.out.println("Found a rabbit without babies.");
         }
         currRabbit = currRabbit.getNext();
      }  
            
   }
}
