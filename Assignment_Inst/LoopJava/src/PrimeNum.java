//15.Write a Java program to determine whether a given number is prime or not.
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        if (num == 1) {
            System.out.println("Not a Prime but Special number...");
        } else {

        for (int i = 2; i <= (num/2); i++) {
            if ((num % i) == 0) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Not Prime T_T ");
        } else {
            System.out.println("Prime :)");
        }
        }
    }
}
