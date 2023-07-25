//17.Write a program in Java to accept a grade and declare the equivalent description :
//
//        Grade	            Description
//        E	                 Excellent
//        V	                 Very Good
//        G	                 Good
//        A	                 Average
//        F	                 Fail
import java.util.Scanner;
public class GradeDiscrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Grade : ");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'E' -> System.out.println("Excellent");
            case 'V' -> System.out.println("Very Good");
            case 'G' -> System.out.println("Good");
            case 'A' -> System.out.println("Average");
            case 'F' -> System.out.println("Fail");
            default -> System.out.println("Invalid Input :(");
        }
    }
}
