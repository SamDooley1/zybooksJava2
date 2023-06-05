/*
Write a recursive method called digitCount() that takes a non-negative 
integer as a parameter and returns the number of digits in the integer. 
Hint: The digit count increases by 1 whenever the input number is divided by 10.

Ex: If the input is:

345
the method digitCount() returns and the program outputs:

3
*/

import java.util.Scanner;

public class LabProgram {
   
   public static int digitCount(int num) {
      if (num < 10) {
         return 1;
      }
      else {
         return 1 + digitCount(num / 10);
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num, digits;
      
      num = scnr.nextInt();
      digits = digitCount(num);
      System.out.println(digits);
   }
}
