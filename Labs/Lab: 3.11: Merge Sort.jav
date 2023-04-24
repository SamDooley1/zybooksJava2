/*
The class is the same as shown at the end of the Merge sort section, with the following changes:

Numbers are entered by a user in a separate helper method, readNums(), instead of defining a specific array in main(). 
The first number is how many integers to be sorted, and the rest are the integers.
Output of the array has been moved to the method printNums().
An output has been added to mergeSort(), showing the indices that will be passed to the recursive method calls.
Add code to the merge sort algorithm to count the number of comparisons performed.

Add code at the end of main() that outputs "comparisons: " followed by the number of comparisons performed (Ex: "comparisons: 12")

Hint: Use a static variable to count the comparisons.

Note: Take special care to look at the output of each test to better understand the merge sort algorithm.

Ex: When the input is:

6 3 2 1 5 9 8
the output is:

unsorted: 3 2 1 5 9 8

0 2 | 3 5
0 1 | 2 2
0 0 | 1 1
3 4 | 5 5
3 3 | 4 4

sorted:   1 2 3 5 8 9
comparisons: 8
*/
import java.util.Scanner;

public class LabProgram {
   // Read size and create an array of size ints.
   // Read size ints, storing them in the array.
   // Return the array.
   static int comparisons = 0;
   
   public static int[] readNums() {
      Scanner scnr = new Scanner(System.in);
      int size = scnr.nextInt();                  // Read array size
      int[] nums = new int[size];                 // Create array
      for (int j = 0; j < size; ++j) {            // Read the numsbers
         nums[j] = scnr.nextInt();
      }
      return nums;                                // Return the array
   }

   // Output the numbers in nums, separated by spaces.
   // No space or newline will be output before the first number or after the last.
   public static void printNums(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i]);
         if (i < nums.length) {
            System.out.print(" ");
         }
      }
   }

   public static void merge(int[] numbers, int i, int j, int k) {
      int mergedSize = k - i + 1;
      int mergedNumbers[] = new int[mergedSize];
      int mergePos;
      int leftPos;
      int rightPos;

      mergePos = 0;
      leftPos = i;
      rightPos = j + 1;

      while (leftPos <= j && rightPos <= k) {
         if (numbers[leftPos] < numbers[rightPos]) {
            mergedNumbers[mergePos] = numbers[leftPos];
            ++leftPos;
         }
         else {
            mergedNumbers[mergePos] = numbers[rightPos];
            ++rightPos;
         }
         ++mergePos;
         ++comparisons;
      }

      while (leftPos <= j) {
         mergedNumbers[mergePos] = numbers[leftPos];
         ++leftPos;
         ++mergePos;
      }

      while (rightPos <= k) {
         mergedNumbers[mergePos] = numbers[rightPos];
         ++rightPos;
         ++mergePos;
      }

      for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
         numbers[i + mergePos] = mergedNumbers[mergePos];
      }
   }

   public static void mergeSort(int numbers[], int i, int k) {
      int j;

      if (i < k) {
         j = (i + k) / 2;
         /* Trace output added to code in book */
         System.out.printf("%d %d | %d %d\n", i, j, j+1, k);

         mergeSort(numbers, i, j);
         mergeSort(numbers, j + 1, k);

         merge(numbers, i, j, k);
      }
   }

   public static void  main(String[] args) {
      int[] numbers = readNums();

      System.out.print("unsorted: ");
      printNums(numbers);
      System.out.println("\n");

      mergeSort(numbers, 0, numbers.length - 1);

      System.out.print("\nsorted:   ");
      printNums(numbers);
      System.out.println();
      System.out.println("comparisons: " + comparisons);
   }
}
