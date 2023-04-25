import jdk.dynalink.beans.StaticClass;

public class Student {

//    class variable, Static variable
    static String StuClgName = "Guru Nanak Dev Rohini DSEU Campus";
    int StuId;
    String StuName;

    //    constructor
    Student(int StuId,String StuName) {
        this.StuId=StuId;
        this.StuName=StuName;
    }

    //     user define method
    void display() {
        System.out.println("Student ID : "+StuId);
        System.out.println("Student Name : "+StuName);
        System.out.println("Student College Name : "+StuClgName+"\n");
    }

    public static void main(String[] args) {
        Student s1 = new Student(2004251312,"Monu Kumar");
        Student s2 = new Student(2004251313,"Lalit Kumar Gupta");
        Student s3 = new Student(2004251314,"Amit Kumar");
        s1.display();
        s2.display();
        s3.display();
    }
}