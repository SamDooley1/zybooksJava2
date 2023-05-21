/*
Define a class StatePair with two generic types (Type1 and Type2), a constructor, mutators, accessors, 
and a printInfo() method. Three ArrayLists have been pre-filled with StatePair data in main():

ArrayList<StatePair<Integer, String>> zipCodeState: Contains ZIP code/state abbreviation pairs
ArrayList<StatePair<String, String>> abbrevState: Contains state abbreviation/state name pairs
ArrayList<StatePair<String, Integer>> statePopulation: Contains state name/population pairs

Complete main() to use an input ZIP code to retrieve the correct state abbreviation from the ArrayList 
zipCodeState. Then use the state abbreviation to retrieve the state name from the ArrayList abbrevState. 
Lastly, use the state name to retrieve the correct state name/population pair from the ArrayList 
statePopulation and output the pair.

Ex: If the input is:

21044
the output is:

Maryland: 6079602
*/

//StatePopulations.java
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class StatePopulations {

   public static ArrayList<StatePair<Integer, String>> fillArray1(ArrayList<StatePair<Integer, String>> statePairs, 
                                                                  Scanner inFS) {
      StatePair<Integer, String> pair;
      int intValue;
      String stringValue;

      while (inFS.hasNextLine()) {
         intValue = inFS.nextInt();
         stringValue = inFS.next();
         pair = new StatePair<Integer, String> (intValue, stringValue);
         statePairs.add(pair);
      }    
      return statePairs;
   }
   
   public static ArrayList<StatePair<String, String>> fillArray2(ArrayList<StatePair<String, String>> statePairs, 
                                                                 Scanner inFS) {
      StatePair<String, String> pair;
      String stringValue1;
      String stringValue2;

      while (inFS.hasNextLine()) {
         stringValue1 = inFS.next();
         inFS.nextLine();
         stringValue2 = inFS.nextLine();
         pair = new StatePair<String, String> (stringValue1, stringValue2);
         statePairs.add(pair);
      }
      return statePairs;
   }
   
   public static ArrayList<StatePair<String, Integer>> fillArray3(ArrayList<StatePair<String, Integer>> statePairs, 
                                                                  Scanner inFS) {
      StatePair<String, Integer> pair;
      String stringValue;
      int intValue;

      while (inFS.hasNextLine()) {
         stringValue = inFS.nextLine();
         intValue = inFS.nextInt();
         inFS.nextLine();
         pair = new StatePair<String, Integer> (stringValue, intValue);
         statePairs.add(pair);
      } 
      return statePairs;
   }
   
   
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int myZipCode;
      int i;
      
      // ZIP code - state abbrev. pairs
      ArrayList<StatePair<Integer, String>> zipCodeState = new ArrayList<StatePair<Integer, String>>();
      
      // state abbrev. - state name pairs
      ArrayList<StatePair<String, String>> abbrevState = new ArrayList<StatePair<String, String>>(); 
      
      // state name - population pairs
      ArrayList<StatePair<String, Integer>> statePopulation = new ArrayList<StatePair<String, Integer>>();
      
      // Fill the three ArrayLists
      
      // Try to open zip_code_state.txt file
      fileByteStream = new FileInputStream("zip_code_state.txt");
      inFS = new Scanner(fileByteStream);
      zipCodeState = fillArray1(zipCodeState, inFS);
      fileByteStream.close(); // close() may throw IOException if fails
      
      // Try to open abbreviation_state.txt file
      fileByteStream = new FileInputStream("abbreviation_state.txt");
      inFS = new Scanner(fileByteStream);
      abbrevState = fillArray2(abbrevState, inFS);
      fileByteStream.close();
      
      // Try to open state_population.txt file
      fileByteStream = new FileInputStream("state_population.txt");
      inFS = new Scanner(fileByteStream);
      statePopulation = fillArray3(statePopulation, inFS);
      fileByteStream.close();
      
      // Read in ZIP code from user
      myZipCode = scnr.nextInt();
      String stateAbbr = "";
      String stateName = "";
        
      for (i = 0; i < zipCodeState.size(); ++i) {
         // TODO: Using ZIP code, find state abbreviation
         if (myZipCode == zipCodeState.get(i).getKey()) {
            stateAbbr = zipCodeState.get(i).getData();
         }
      }
      
      
      for (i = 0; i < abbrevState.size(); ++i) {
         // TODO: Using state abbreviation, find state name
         if (stateAbbr.compareTo(abbrevState.get(i).getKey()) == 0) {
            stateName = abbrevState.get(i).getData();
         }
      }
      
      
      for (i = 0; i < statePopulation.size(); ++i) {
         // TODO: Using state name, find population. Print pair info.
         if (stateName.compareTo(statePopulation.get(i).getKey()) == 0) {
            StatePair state = statePopulation.get(i);
            state.printInfo();
         }
      }
   }
}

//StatePair.java
public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
   private Type1 key;
   private Type2 data;
   
   // TODO: Define a constructor, mutators, and accessors 
   //       for StatePair
   public StatePair(Type1 key1, Type2 data1) {
      key = key1;
      data = data1;
   }
   
   public void setKey(Type1 key) {
      this.key = key;
   }
   
   public void setData(Type2 data) {
      this.data = data;
   }
   
   public Type1 getKey() {
      return key;
   }
   
   public Type2 getData() {
      return data;
   }
   
   // TODO: Define printInfo() method
   public void printInfo() {
      System.out.println(key +": " + data);
   }
}
