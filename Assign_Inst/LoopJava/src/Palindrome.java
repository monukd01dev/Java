//19.Write a program in Java to check whether a number is a palindrome or not.
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,ans=0,temp;
        System.out.print("Enter the number : ");
        num = input.nextInt();
        temp = num;
        while (num > 0) {
            int rem = num % 10;
            num/=10;
            ans = ans*10+rem;

        }
        if (temp == ans) {
            System.out.println("Palindrome :)");
        } else {
            System.out.println("Not Palindrome T_T ");
        }
    }
}
