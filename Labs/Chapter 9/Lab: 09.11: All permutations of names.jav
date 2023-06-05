/*
Write a program that lists all ways people can line up for a photo (all permutations 
of a list of Strings). The program will read a list of one word names (until -1), and 
use a recursive method to create and output all possible orderings of those names 
separated by a comma, one ordering per line.

When the input is:

Julia Lucas Mia -1
then the output is (must match the below ordering):

Julia, Lucas, Mia 
Julia, Mia, Lucas
Lucas, Julia, Mia
Lucas, Mia, Julia
Mia, Julia, Lucas
Mia, Lucas, Julia
*/

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

   // TODO: Write method to create and output all permutations of the list of names.
   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      String removedName;
      
      if (nameList.size() == 0) {
         for (int i = 0; i < permList.size(); i++) {
            System.out.print(permList.get(i));
            if (i != permList.size() - 1) {
               System.out.print(", ");
            }
         }
         System.out.println();
      }
      
      else {
         for (int i = 0; i < nameList.size(); i++) {
            removedName = nameList.remove(i);
            permList.add(removedName);
            printAllPermutations(permList, nameList);
            permList.remove(permList.size() - 1);
            nameList.add(i, removedName);
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name = "temp";
      
      // TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
      while(!name.equals("-1")) {
         name = scnr.next();
         if (name.equals("-1")) {
            break;
         }
         nameList.add(name);
      }
      
      printAllPermutations(permList, nameList);
   }
}
