/*
Write a void method selectionSortDescendTrace() that takes an integer array, and sorts the array into descending order. 
The method should use nested loops and output the array after each iteration of the outer loop, thus outputting the array 
N-1 times (where N is the size). Complete main() to read in a list of up to 10 positive integers (ending in -1) and then 
call the selectionSortDescendTrace() method.

If the input is:

20 10 30 40 -1
then the output is:

40 10 30 20 
40 30 10 20 
40 30 20 10
*/

import java.util.Scanner;

public class DescendingOrder {
   // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
      int i;
      int j;
      int elementIndex;
      int temp;

      for (i = 0; i < numElements - 1; ++i) {
         if (numbers[i] != 0) { 
            elementIndex = i;
            for (j = i + 1; j < numbers.length; ++j) {
               if (numbers[elementIndex] < numbers[j]) {
                  elementIndex = j;
               }
            }
            temp = numbers[i];
            numbers[i] = numbers[elementIndex];
            numbers[elementIndex] = temp;
            
            for(int num : numbers) {
               if (num != 0) {
                  System.out.print(num + " ");
               }
            }
            System.out.println();
         }
      }
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      while (numElements < 10) {
            int number = scnr.nextInt();
            if (number == -1) {
                break;
            }
            
            numbers[numElements] = number;
            numElements++;
      }
      
      selectionSortDescendTrace(numbers, numElements);

   }
}
