/*
Binary search can be implemented as a recursive algorithm. Each call makes a recursive 
call on one-half of the list the call received as an argument.

Complete the recursive method binarySearch() with the following specifications:

Parameters:
a target integer
an ArrayList of integers
lower and upper bounds within which the recursive call will search
Return value:
the index within the ArrayList where the target is located
-1 if target is not found
The template provides main() and a helper function that reads an ArrayList from input.

The algorithm begins by choosing an index midway between the lower and upper bounds.

If target == integers.get(index) return index
If lower == upper, return -1 to indicate not found
Otherwise call the function recursively on half the ArrayList parameter:
If integers.get(index) < target, search the ArrayList from index + 1 to upper
If integers.get(index) > target, search the ArrayList from lower to index - 1
The ArrayList must be ordered, but duplicates are allowed.

Once the search algorithm works correctly, add the following to binarySearch():

Count the number of calls to binarySearch().
Count the number of times when the target is compared to an element of the ArrayList. 
Note: lower == upper should not be counted.
Hint: Use a static variable to count calls and comparisons.

The input of the program consists of:

the number of integers in the ArrayList
the integers in the ArrayList
the target to be located
Ex: If the input is:

9
1 2 3 4 5 6 7 8 9
2
the output is:

index: 1, recursions: 2, comparisons: 3
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {
   // Read and return an ArrayList of integers.
   static int recursions;
   static int comparisons = 0;
   
   private static ArrayList<Integer> readNums(Scanner scnr) {
      int size = scnr.nextInt();                // Read size of ArrayList
      ArrayList<Integer> nums = new ArrayList<Integer>();
      for (int i = 0; i < size; ++i) {          // Read the numbers
         nums.add(scnr.nextInt());
      }
      return nums;
   }

   static public int binarySearch(int target, ArrayList<Integer> integers,
                                    int lower, int upper) {
      /* Type your code here. */
      int midpoint;
      
      recursions++;
      midpoint = (lower + upper) / 2;
      
      comparisons++;
      if (integers.get(midpoint) == target) {
         return midpoint;
      }
      else if (lower == upper){
         return -1;
      }
      else if (integers.get(midpoint) < target) {
         comparisons++;
         return binarySearch(target, integers, midpoint + 1, upper);
      }
      else {
         comparisons++;
         return binarySearch(target, integers, lower, midpoint - 1);
      }
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Input a list of integers
      ArrayList<Integer> integers = readNums(scnr);

      // Input a target value for the search
      int target = scnr.nextInt();

      int index = binarySearch(target, integers, 0, integers.size() - 1);

      System.out.printf("index: %d, recursions: %d, comparisons: %d\n",
                        index, recursions, comparisons);
   }
}
