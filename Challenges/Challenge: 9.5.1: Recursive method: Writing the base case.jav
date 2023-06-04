/*
Write code to complete doublePennies()'s base case. Sample output for below program with inputs 1 and 10:
Number of pennies after 10 days: 1024
Note: If the submitted code has an infinite loop, the system will stop running the code after a few seconds, 
and report "Program end never reached." The system doesn't print the test case that caused the reported message.
*/

import java.util.Scanner;

public class CalculatePennies {
// Returns number of pennies if pennies are doubled numDays times
   public static long doublePennies(long numPennies, int numDays) {
      long totalPennies;

      /* Your solution goes here  */
      if(numDays == 0) {
         totalPennies = numPennies;
      }
      
      else {
         totalPennies = doublePennies((numPennies * 2), numDays - 1);
      }

      return totalPennies;
   }

// Program computes pennies if you have 1 penny today,
// 2 pennies after one day, 4 after two days, and so on
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      long startingPennies;
      int userDays;

      startingPennies = scnr.nextLong();
      userDays = scnr.nextInt();
      System.out.println("Number of pennies after " + userDays + " days: "
           + doublePennies(startingPennies, userDays));
   }
}
