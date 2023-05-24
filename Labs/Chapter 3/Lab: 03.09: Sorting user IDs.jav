/*
Given a main() that reads user IDs (until -1), complete the quicksort() and partition() 
methods to sort the IDs in ascending order using the Quicksort algorithm, and output the 
sorted IDs one per line.

Ex. If the input is:

kaylasimms 
julia 
myron1994 
kaylajones 
-1
the output is:

julia 
kaylajones
kaylasimms
myron1994 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {
   // TODO: Write the partitioning algorithm - pick the middle element as the 
   //       pivot, compare the values using two index variables l and h (low and high), 
   //       initialized to the left and right sides of the current elements being sorted,
   //       and determine if a swap is necessary
   public static int partition(ArrayList<String> userIDs, int i, int k) {
      int l;
      int h;
      int midpoint;
      String pivot;
      String temp;
      boolean done;

      midpoint = i + (k - i) / 2;
      pivot = userIDs.get(midpoint);

      done = false;
      l = i;
      h = k;

      while (!done) {
         while (userIDs.get(l).compareTo(pivot) < 0) {
            ++l;
         }

         while (userIDs.get(h).compareTo(pivot) > 0) {
            --h;
         }

         if (l >= h) {
            done = true;
         } 
         else {
            temp = userIDs.get(l);
            userIDs.set(l, userIDs.get(h));
            userIDs.set(h, temp);

            ++l;
            --h;
         }
      }

      return h;
   }

   // TODO: Write the quicksort algorithm that recursively sorts the low and 
   //       high partitions
   public static void quicksort(ArrayList<String> userIDs, int i, int k) {
      int j;

      if (i >= k) {
         return;
      }

      j = partition(userIDs, i, k);

      quicksort(userIDs, i, j);
      quicksort(userIDs, j + 1, k);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      ArrayList<String> userIDList = new ArrayList<String>();

      String userID;

      userID = scnr.next();
      while (!userID.equals("-1")) {
         userIDList.add(userID);
         userID = scnr.next();
      }
      
      // Initial call to quicksort 
      quicksort(userIDList, 0, userIDList.size() - 1);

      for (int i = 0; i < userIDList.size(); ++i) {
         System.out.println(userIDList.get(i));
      }
   }
}
