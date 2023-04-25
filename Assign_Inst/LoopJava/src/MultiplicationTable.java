//6.Write a program in Java to display the multiplication table of a given integer.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = input.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num+" * "+i+ " = "+num*i);

        }
    }
}
