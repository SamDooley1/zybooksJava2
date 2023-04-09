/* Write a program that reads a list of integers, and outputs the two smallest integers in the list, in ascending order. 
The input begins with an integer indicating the number of integers that follow. You can assume that the list will have at 
least 2 integers and fewer than 20 integers.

Ex: If the input is:

5
10 5 3 21 2
the output is:

2 and 3
To achieve the above, first read the integers into an array.

Hint: Make sure to initialize the second smallest and smallest integers properly. */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int temp;
      int current;
      int arraySize = scnr.nextInt();
      int[] listArray = new int[arraySize];
      
      for (int i = 0; i < arraySize; i++) {
            listArray[i] = scnr.nextInt();
      }
      
      int smallest = listArray[0];
      int secondSmallest = listArray[1];
      
      if (smallest > secondSmallest) {
            temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
      }
      
      for (int i = 2; i < arraySize; i++) {
         current = listArray[i];
         if (current < smallest) {
            secondSmallest = smallest;
            smallest = current;
         } 
         else if (current < secondSmallest) {
         secondSmallest = current;
         }
      }
      
      System.out.println(smallest + " and " + secondSmallest);
   }
}
