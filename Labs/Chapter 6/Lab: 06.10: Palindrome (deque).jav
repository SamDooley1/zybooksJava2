/*
A palindrome is a string that reads the same backwards and forwards. Use a deque to implement a 
program that tests whether a line of text is a palindrome. The program reads a line, then outputs 
whether the input is a palindrome or not.

Ex: If the input is:

senile felines!
the output is:

Yes, "senile felines!" is a palindrome.
Ex: If the input is:

rotostor
the output is:

No, "rotostor" is not a palindrome.
Ignore punctuation and spacing. Assume all alphabetic characters will be lowercase.

Special case: A one-character string is a palindrome.

Hint: The deque must be a Deque of Characters, but ordinary chars will be automatically converted 
to Characters when added to the deque.
*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class LabProgram {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int j;
      String line;
      String userInput = scnr.nextLine();
      char val;
      boolean pali = true;

      /* Type your code here. */
      Deque<Character> deque = new LinkedList<Character>();
      
      for (j = 0; j < userInput.length(); j++) {
         val = userInput.charAt(j);
         if (Character.isLetter(val) || Character.isDigit(val)) {
            deque.addLast(Character.toLowerCase(val));
         }
      }
      
      while (deque.size() > 1) {
         if (deque.removeFirst() != deque.removeLast()) {
            pali = false;
         }
      }
      
      if (pali) {
         System.out.println("Yes, \"" + userInput + "\" is a palindrome.");
      }
      else {
         System.out.println("No, \"" + userInput + "\" is not a palindrome.");
      }
      

   }
}
