//5.Write a program to read the age of a candidate and determine whether it is eligible for casting his/her own vote.
import java.util.Scanner;
public class VoteOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println(":) you are eligible to vote...");
        }
        else {
            System.out.println(":( you are uneligible to vote...");
        }

    }
}
