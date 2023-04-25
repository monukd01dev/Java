//9.Write a program in Java to display the n terms of even natural number and their sum.
import java.util.Scanner;
public class EvenNatNumSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + "\t");
                sum+=i;
            }
        }
        System.out.println("\nThe Sum : "+sum);
    }
}
