/* 
Assign courseStudent's name with Smith, age with 20, and ID with 9999. Use the printAll() 
member method and a separate println() statement to output courseStudents's data. Sample output from the given program:

Name: Smith, Age: 20, ID: 9999 
*/

// ===== Code from file Person.java =====
public class Person {
   private int ageYears;
   private String lastName;

   public void setName(String userName) {
      lastName  = userName;
   }

   public void setAge(int numYears) {
      ageYears = numYears;
   }

   // Other parts omitted

   public void printAll() {
      System.out.print("Name: " + lastName);
      System.out.print(", Age: "  + ageYears);
   }
}
// ===== end =====

// ===== Code from file Student.java =====
public class Student extends Person {
   private int idNum;

   public void setID(int studentId) {
      idNum = studentId;
   }

   public int getID() {
      return idNum;
   }
}
// ===== end =====

// ===== Code from file StudentDerivationFromPerson.java =====
public class StudentDerivationFromPerson {
   public static void main(String[] args) {
      Student courseStudent = new Student();

      /* Your solution goes here  */
      courseStudent.setName("Smith");
      courseStudent.setAge(20);
      courseStudent.setID(9999);
      
      courseStudent.printAll();
      System.out.println(", ID: " + courseStudent.getID());

   }
}
// ===== end =====
