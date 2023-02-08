//3.Write a program to check whether a given number is positive or negative.
import java.util.Scanner;
public class PosOrNeg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        if(num==0){
            System.out.println("Neither Positive Nor Negative...");
        } else if (num>0) {
            System.out.println("Number is Positive...");
        }
        else {
            System.out.println("Number is Negative...");
        }

    }
}
