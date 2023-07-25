//4.Write a program to find whether a given year is a leap year or not.
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you want to check : ");
        int year = input.nextInt();
        if((year%4)==0){
            System.out.println("Its a Leap year...");
        }
        else {
            System.out.println("Not a Leap year...");
        }
    }
}
