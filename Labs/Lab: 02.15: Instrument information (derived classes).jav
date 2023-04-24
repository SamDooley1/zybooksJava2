/*
Given main() and the Instrument class, define a derived class, StringInstrument, with methods to set and get private fields of the following types:

int to store the number of strings
int to store the number of frets
boolean to store whether the instrument is bowed
Ex. If the input is:

Drums
Zildjian
2015
2500
Guitar
Gibson
2002
1200
6
19
false
the output is:

Instrument Information: 
   Name: Drums
   Manufacturer: Zildjian
   Year built: 2015
   Cost: 2500
Instrument Information: 
   Name: Guitar
   Manufacturer: Gibson
   Year built: 2002
   Cost: 1200
   Number of strings: 6
   Number of frets: 19
   Is bowed: false
*/

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   // TODO: Declare private fields
   private int numOfStrings, numOfFrets;
   private boolean isBowed;

   // TODO: Define mutator methods - 
   //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
   public void setNumOfStrings(int numStrings){
      numOfStrings = numStrings;
   }
   
   public void setNumOfFrets(int numFrets){
      numOfFrets = numFrets;
   }
   
   public void setIsBowed(boolean bowed){
      isBowed = bowed;
   }
   


   // TODO: Define accessor methods - 
   //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
   
   public int getNumOfStrings(){
      return numOfStrings;
   }
   
   public int getNumOfFrets(){
      return numOfFrets;
   }
   
   public boolean getIsBowed(){
      return isBowed;
   }

}
