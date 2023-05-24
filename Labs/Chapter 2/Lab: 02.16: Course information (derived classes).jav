/*
Given main(), define a Course base class with methods to set and get private fields of the following types:

String to store the course number
String to store the course title
Define Course's PrintInfo() method that outputs the course number and title.

Then, define a derived class OfferedCourse with methods to set and get private fields of the following types:

String to store the instructor's name
String to store the location
String to store the class time
Ex. If the input is:

ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Wilson Hall 231
WF: 2-3:30 pm
the output is:

Course Information:
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information:
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Location: Wilson Hall 231
   Class Time: WF: 2-3:30 pm
*/


//Course.java
public class Course{
   // TODO: Declare private fields
   protected String courseNum, courseTit;

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
   public void setCourseNumber(String courseNumber){
      courseNum = courseNumber;
   }
   
   public void setCourseTitle(String courseTitle){
      courseTit = courseTitle;
   }


   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
   public String getCourseNumber(){
      return courseNum;
   }
   
   public String getCourseTitle(){
      return courseTit;
   }

   // TODO: Define printInfo()
   public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + courseNum);
        System.out.println("   Course Title: " + courseTit);
    }
 
}

//OfferedCourse.java
{
   // TODO: Declare private fields
   private String instName, loc, time;

   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
   public void setInstructorName(String instructorName){
      instName = instructorName;
   }
   
   public void setLocation(String location){
      loc = location;
   }
   
   public void setClassTime(String classTime){
      time = classTime;
   }


   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
   public String getInstructorName(){
      return instName;
   }
   
   public String getLocation(){
      return loc;
   }
   
   public String getClassTime(){
      return time;
   }

}
