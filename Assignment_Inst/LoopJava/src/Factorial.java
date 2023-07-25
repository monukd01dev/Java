//8.Write a Java program to calculate the factorial of a given number.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        for (int i = 1; i < num; i++) {
            if ((num % i) == 0) {
                System.out.print(i+"\t");
            }
        }
        System.out.println(" ");
    }
}
