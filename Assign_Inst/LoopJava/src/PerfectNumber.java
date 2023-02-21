//11.Write a Java program to check whether a given number is a perfect number or not.
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        for (int i = 1; i < num; i++) {
            if ((num % i) == 0) {
                sum+=i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number...");
        } else {
            System.out.println(num + " is not a perfect number...");

        }
    }
}
