class Student  {
  String name;
  String father_name;
  int roll_no;
  int addmission_no;
  int bod;

  public void Details(){
    System.out.println(" Studnet name is " + name);
    System.out.println(" Student father name is " + father_name);
    System.out.println(" Student roll no is " + roll_no);
    System.out.println(" Student addmision number is " + addmission_no);
    System.out.println(" Student age  is " + bod);
  }

    
}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println(" This our Student coustom class ");
        Student a = new Student();   // first attribute 
        Student r = new Student();   // second attribute
        
        
        a.name = "Aman";
        a.father_name= "Ravinder";
        a.roll_no = 45;
        a.addmission_no = 234;
        a.bod = 16;

        r.name = " Roshan ";
        r.father_name = " Satender ";
        r.roll_no = 24;
        r.addmission_no = 237;
        r.bod= 16;

        a.Details();
        r.Details();
         
    }
}
