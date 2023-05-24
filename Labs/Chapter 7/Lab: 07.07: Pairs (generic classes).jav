/*
Complete Pair.java by defining the following constructor and methods:

public Pair(TheType aVal, TheType bVal)
Initialize the public fields firstVal to aVal and secondVal to bVal
String toString()
Return a string representation of the pair in the format "[firstVal, secondVal]"
int compareTo(Pair otherPair)
Return -1, 0, or 1 according to whether the Pair is less than, equal to, or greater than otherPair
Precedence of comparisons: firstVal, then secondVal
char comparisonSymbol(Pair otherPair)
Return a character: '<', '=', or '>' representing the result returned by compareTo()
Complete LabProgram.java:

Define readIntegerPair(), readDoublePair(), and readWordPair()
Take a scanner object as a parameter and return a Pair object of a specific data type
Read two values, separated by a space, from input and create a Pair object with the input values in the same order
Complete the output section of main().
For each data type, output the two Pair objects separated by the character returned by comparisonSymbol()
Note: main() calls each read method twice to create two Pair objects of the corresponding type.

Ex: If the input for 2 Pair objects of Integer is:

4 6 3 5
the first Pair object contains [4, 6], and the second Pair object contains [3, 5].

Ex: If the input of the program is:

4 6 3 5
4.3 2.1 4.3 2.1
one two three four
the output is:

[4, 6] > [3, 5]
[4.3, 2.1] = [4.3, 2.1]
[one, two] < [three, four]
*/

//LabProgram.java
import java.util.Scanner;

public class LabProgram {
   public static Pair<Integer> readIntegerPair(Scanner scnr) {
      /* Type your code here. */
      int firstVal = scnr.nextInt();
      int secondVal = scnr.nextInt();
      return new Pair<Integer> (firstVal, secondVal);
   }

   public static Pair<Double> readDoublePair(Scanner scnr) {
      /* Type your code here. */
      double firstVal = scnr.nextDouble();
      double secondVal = scnr.nextDouble();
      return new Pair<Double> (firstVal, secondVal);      
   }

   public static Pair<String> readWordPair(Scanner scnr) {
      /* Type your code here. */
      String firstVal = scnr.next();
      String secondVal = scnr.next();
      return new Pair<String> (firstVal, secondVal);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pair<Integer> integerPair1 = readIntegerPair(scnr);
      Pair<Integer> integerPair2 = readIntegerPair(scnr);

      Pair<Double> doublePair1 = readDoublePair(scnr);
      Pair<Double> doublePair2 = readDoublePair(scnr);

      Pair<String> wordPair1 = readWordPair(scnr);
      Pair<String> wordPair2 = readWordPair(scnr);

      /* Type the code for output here. */
      System.out.println(integerPair1 + " " + integerPair1.comparisonSymbol(integerPair2) + " " + integerPair2);
      System.out.println(doublePair1 + " " + doublePair1.comparisonSymbol(doublePair2) + " " + doublePair2);
      System.out.println(wordPair1 + " " + wordPair1.comparisonSymbol(wordPair2) + " " + wordPair2);
   }
}

//Pair.java
public class Pair <TheType extends Comparable<TheType>> {
   private TheType firstVal;
   private TheType secondVal;

   /* Type the code for The constructor here. */
   public Pair(TheType aVal, TheType bVal) {
      firstVal = aVal;
      secondVal = bVal;
   }

   public String toString() {
      /* Type your code here. */
      return "[" + firstVal + ", " + secondVal + "]";
   }

   // Implement Comparable's expected compareTo()
   public int compareTo(Pair<TheType> otherPair) {
      /* Type your code here. */
      int comp1 = firstVal.compareTo(otherPair.firstVal);
      if (comp1 < 0) {
         return -1;
      }
      else if (comp1 > 0) {
         return 1;
      }
      
      int comp2 = secondVal.compareTo(otherPair.secondVal);
      if (comp2 == 0) {
         return 0;
      }
      else if (comp2 < 0) {
         return -1;
      }
      else {
         return 1;
      }
   }

   // Return '<', '=', or '>' according to the ordering of this pair and otherPair
   public char comparisonSymbol(Pair<TheType> otherPair) {
      /* Type your code here. */
      int comp = compareTo(otherPair);
      if (comp < 0) {
         return '<';
      }
      else if (comp > 0) {
         return '>';
      } 
      else {
         return '=';
      }
   }
}
