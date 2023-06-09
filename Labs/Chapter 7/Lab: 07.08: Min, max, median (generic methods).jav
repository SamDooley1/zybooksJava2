/*
Given main(), complete LabProgram.java by implementing the following methods:

inputIntegers()
Take a scanner as a parameter
Read 5 integers from a user
Store the integers in an ArrayList of type Integer
Return the ArrayList
inputDoubles()
Take a scanner as a parameter
Read 5 doubles from a user
Store the doubles in an ArrayList of type Double
Return the ArrayList
inputWords()
Take a scanner as a parameter
Read 5 one-word strings from a user
Store the strings in an ArrayList of type String
Return the ArrayList
print()
Take an ArrayList as a parameter
Output the elements of the ArrayList parameter
For coding simplicity, follow each output element by a space, including the last one
Output a newline after the last element
getStatistics()
Take an ArrayList as a parameter
Store the minimum, median, and maximum values of the ArrayList parameter in a new ArrayList
Return the new ArrayList containing the minimum, median, and maximum values
Hint: Sort the ArrayList by using Collections.sort() to find the minimum, median, and maximum values
Ex: If the input is:

3 1 5 9 7
2.2 3.3 1.1 4.4 5.5
one two three four five
the output is:

3 1 5 9 7 
1 5 9 

2.2 3.3 1.1 4.4 5.5 
1.1 3.3 5.5 

one two three four five 
five one two
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {

   // Input 5 Integers and return the Integers in an ArrayList
   public static ArrayList<Integer> inputIntegers(Scanner scnr) {
      /* Type your code here. */
      ArrayList<Integer> userInputs = new ArrayList<>();
      
      for (int i = 0; i < 5; i++) {
         int input = scnr.nextInt();
         userInputs.add(input);
      }
      
      return userInputs;
   }

   // Input 5 Doubles and return the Doubles in an ArrayList
   public static ArrayList<Double> inputDoubles(Scanner scnr) {
      /* Type your code here. */
      ArrayList<Double> userInputs = new ArrayList<>();
      
      for (int i = 0; i < 5; i++) {
         Double input = scnr.nextDouble();
         userInputs.add(input);
      }
      
      return userInputs;
   }

   // Input 5 Strings, and return the Strings in an ArrayList
   public static ArrayList<String> inputWords(Scanner scnr) {
      /* Type your code here. */
      ArrayList<String> userInputs = new ArrayList<>();
      
      for (int i = 0; i < 5; i++) {
         String input = scnr.next();
         userInputs.add(input);
      }
      
      return userInputs;
   }

   // Output the elements of the ArrayList parameter
   public static <TheType extends Comparable<TheType>> void print(ArrayList<TheType> list) {
      /* Type your code here. */
      for (int i = 0; i < list.size(); i++) {
         System.out.print(list.get(i) + " ");
      }
      System.out.println();
   }

   // Return the min, median, and max of the ArrayList parameter in a new ArrayList
   public static <TheType extends Comparable<TheType>> ArrayList<TheType> getStatistics(ArrayList<TheType> list) {
      /* Type your code here. */
      ArrayList<TheType> stats = new ArrayList<>();
      Collections.sort(list);
      
      TheType minVal = list.get(0);
      TheType maxVal = list.get(list.size() - 1);
      TheType midVal = list.get(list.size() / 2);
      
      stats.add(minVal);
      stats.add(midVal);
      stats.add(maxVal);
      
      return stats;
      
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input a list of 5 Integers and print the ArrayList's statistics
      ArrayList<Integer> integers = inputIntegers(scnr);
      print(integers);
      ArrayList<Integer> integerStatistics = getStatistics(integers);
      print(integerStatistics);
      System.out.println();

      // Input a list of 5 Doubles and print the ArrayList's statistics
      ArrayList<Double> doubles = inputDoubles(scnr);
      print(doubles);
      ArrayList<Double> doubleStatistics = getStatistics(doubles);
      print(doubleStatistics);
      System.out.println();

      // Input a list of 5 words (Strings) and print the ArrayList's statistics
      ArrayList<String> words = inputWords(scnr);
      print(words);
      ArrayList<String> wordStatistics = getStatistics(words);
      print(wordStatistics);
   }
}
