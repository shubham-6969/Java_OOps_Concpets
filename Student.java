/*4. Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName, 
and grade. Implement a default constructor and a parameterized constructor 
that takes all three instance variables. Use constructor chaining to initialize the variables.
 Print the values of the variables. */

 public class Student {
     private int studentId;
     private String studentName;
     private String grade;

     public  Student(){
      /*   this.(0,"Unknown"," None");    wrong  beacuse The default constructor 
                                       should not be calling the other constructor directly. 
                                      Instead, it should be initializing its own fields.  */
        this.studentId = 0;
        this.studentName = "Unknown";
        this.grade = "None";
     }

     public Student(int studentId,String studentName,String grade){
        this.studentId =  studentId;
        this.studentName = studentName;
        this.grade = grade;
     }
    public static void main(String[] args) {
        
    
        Student myStudent1 = new Student();
        System.out.println("Student1 name is "+ myStudent1.studentName);
        System.out.println("Student1 Id is "+ myStudent1.studentId);
        System.out.println("Student1 grade is "+ myStudent1.grade);

        Student myStudent2 = new Student(12,"Rohan","A");
        System.out.println("Student2 Id is:"+ myStudent2.studentId);
        System.out.println("Studnet2 name is "+myStudent2.studentName);
        System.out.println("Studnet2 grade is "+myStudent2.grade);

    }
}
