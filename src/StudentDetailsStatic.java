public class StudentDetailsStatic {
    String name;

    //static variable
    static String department;
    static int rollCount=0;

    //static block is used to initialize static variable
    static{
        System.out.println("Inside Static Block");
        department="CS";
    }

    //static method to change the value of static variable
    static void change(){
        rollCount++;
    }

    //constructor to initialize the variable
    StudentDetailsStatic(String studentName){
        change();
        name = studentName;
    }
    //method to display values;
    void display(){
        System.out.println(rollCount+" "+name+" "+department);
    }

}

//Test class to create and display the values of object
class Student{

    public static void main(String args[]){

        StudentDetailsStatic student1 = new StudentDetailsStatic("Tom");
        student1.display();
        StudentDetailsStatic student2 = new StudentDetailsStatic("Chris");
        student2.display();
        StudentDetailsStatic student3 = new StudentDetailsStatic("Morris");
        student3.display();



        //We can change the value of static variable department as shown below
        //Display student4 object with ECE department
        //Uncomment the code given below to perform the task
		    /*StudentDetails student4 = new StudentDetails("Cherry");
		      StudentDetails.department="ECE";
		      student4.display();*/
    }
}

