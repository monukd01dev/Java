import java.util.Scanner;
//2.Write a program to check whether a given number is even or odd.
public class EvenOddCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();
        if ((num%2)==0){
            System.out.println("Entered number is even...");
        }
        else {
            System.out.println("Entered number is odd...");
        }
    }
}
