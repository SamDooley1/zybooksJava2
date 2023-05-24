/*
Two sorted lists have been created, one implemented using a linked list (LinkedListLibrary linkedListLibrary) 
and the other implemented using the built-in ArrayList class (ArrayListLibrary arrayListLibrary). Each list 
contains 100 books (title, ISBN number, author), sorted in ascending order by ISBN number.

Complete main() by inserting a new book into each list using the respective LinkedListLibrary and 
ArrayListLibrary insertSorted() methods and outputting the number of operations the computer must perform to 
insert the new book. Each insertSorted() returns the number of operations the computer performs.

Ex: If the input is:

The Catcher in the Rye
9787543321724
J.D. Salinger
the output is:

Number of linked list operations: 1
Number of ArrayList operations: 1
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Library {
   
   public static void fillLibraries(LinkedListLibrary linkedListLibrary, ArrayListLibrary arrayListLibrary) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int linkedListOperations = 0;
      int arrayListOperations = 0;
      
      BookNode currNode;
      Book tempBook;
      
      String bookTitle;
      String bookAuthor;
      long bookISBN;
      
      // Try to open file
      fileByteStream = new FileInputStream("Books.txt");
      inFS = new Scanner(fileByteStream);

      while (inFS.hasNextLine()) {
         bookTitle = inFS.nextLine();
         bookISBN = inFS.nextLong();
         inFS.nextLine();
         bookAuthor = inFS.nextLine();
         
         // Insert into linked list
         currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
         linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
         linkedListLibrary.lastNode = currNode;
         
         // Insert into ArrayList
         tempBook = new Book(bookTitle, bookAuthor, bookISBN);
         arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);
      }
      
      fileByteStream.close(); // close() may throw IOException if fails
   }
       
   public static void main (String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int linkedListOperations = 0;
      int arrayListOperations = 0;
      
      // Create libraries
      LinkedListLibrary linkedListLibrary = new LinkedListLibrary();
      ArrayListLibrary arrayListLibrary = new ArrayListLibrary();
      
      // Fill libraries with 100 books
      fillLibraries(linkedListLibrary, arrayListLibrary);
      
      // Create new book to insert into libraries
      BookNode currNode;
      Book tempBook;
      
      String bookTitle;
      String bookAuthor;
      long bookISBN;
      
      bookTitle = scnr.nextLine();
      bookISBN = scnr.nextLong();
      scnr.nextLine();
      bookAuthor = scnr.nextLine();
       
      // Insert into linked list
      currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
      // TODO: Call LL_Library's insertSorted() method to insert currNode and return
      //       the number of operations performed
      linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
      
      linkedListLibrary.lastNode = currNode;
      
      // Insert into ArrayList
      tempBook = new Book(bookTitle, bookAuthor, bookISBN);
      // TODO: Call AL_Library's insertSorted() method to insert tempBook and return
      //       the number of operations performed
      arrayListOperations = arrayListLibrary.insertSorted(tempBook, 0);
      
      // TODO: Print number of operations for linked list
      System.out.println("Number of linked list operations: " + linkedListOperations);
      
      // TODO: Print number of operations for ArrayList
      System.out.println("Number of ArrayList operations: " + arrayListOperations);
   }
}
