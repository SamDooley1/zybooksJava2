/*
Write a recursive method called printNumPattern() to output the following number pattern.

Given a positive integer as input (Ex: 12), subtract another positive integer (Ex: 3) continually
until a negative value is reached, and then continually add the second integer until the first 
integer is again reached. For this lab, do not end output with a newline.

Ex. If the input is:

12
3
the output is:

12 9 6 3 0 -3 0 3 6 9 12 
*/

import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method
   public static void printNumPattern(int num1, int num2) {
      int temp = num1;
      
      System.out.print(num1 + " ");
      
      if (num1 < 0) {
         if (num1 == temp) {
            return;
         }
         
         else {
            printNumPattern(num1 + num2, num2);
         }
      }
      
      else {
         printNumPattern(num1 - num2, num2);
         System.out.print(num1 + " ");
      }
   }
         
      
  
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2); 
   } 
} 
