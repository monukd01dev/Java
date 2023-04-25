import java.util.Scanner;

public class Employee {
    int emp_id;
    String emp_name;
    String emp_post;
    String emp_depart;

//    Method's of class employee
        Scanner input = new Scanner(System.in);
    void setEmpDet(){
        System.out.print("Enter ID : ");
        emp_id = input.nextInt();
        System.out.print("Enter Name : ");
        System.out.print("Enter Post : ");
        System.out.print("Enter Department : ");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}