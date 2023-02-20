//3.Write a program in Java to display n terms of natural number and their sum.
import java.util.Scanner;
public class NnaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range, sum = 0;
        System.out.print("Enter the range : ");
        range = input.nextInt();
        for (int i = 1; i <= range; i++) {
            System.out.print(i+"\t");
            sum+=i;
        }
        System.out.println("\nSum of "+range+" Natural numbers is "+sum+".");

    }

}
