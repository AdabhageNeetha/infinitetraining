import java.io.EOFException;
import java.io.IOException;

class UndergraduateStudent extends Studentt{
    //This method overrides display() of parent Student
    @Override
    public void display() throws RuntimeException {
        System.out.println("This Student is Undergraduate");
    }


}
 class GraduateStudent extends Studentt{
    //This method overrides display() of parent Student
    @Override
    public void display() {
        System.out.println("This Student is Graduate");
    }
    void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {

        Studentt student = new Studentt();
        student.display();

        Studentt obj1 = new GraduateStudent();
        GraduateStudent obj3 = new GraduateStudent();
//        GraduateStudent obj = new Student(); -- compile time error
        obj1.display();
        obj3.show();
        obj1.disp();
//        obj1.show();

        Studentt obj2 = new UndergraduateStudent();
        obj2.display();
    }
}