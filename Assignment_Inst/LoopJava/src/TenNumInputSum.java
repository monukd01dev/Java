//4.Write a program in Java to read 10 numbers from keyboard and find their sum and average.
import java.util.Scanner;
public class TenNumInputSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Enter your "+i+" number : ");
            sum+=input.nextInt();
        }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+sum/10);
    }
}