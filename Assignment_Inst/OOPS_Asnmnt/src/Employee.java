import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee {
    private int emp_num;
    private float emp_compnsatn;

    void set() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee Number : ");
        emp_num = sc.nextInt();
        System.out.print("Enter the Employee Compensation : ");
        emp_compnsatn = sc.nextFloat();

    }

    void get() {
        System.out.println("Employee Details :-");
        System.out.println("Employee Number : "+emp_num);
        System.out.println("Employee Compensation : "+emp_compnsatn);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.set();
        e1.get();
    }
}
