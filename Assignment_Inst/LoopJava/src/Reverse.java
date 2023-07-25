//18.Write a program in Java to display the number in reverse order.
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,ans=0;
        System.out.print("Enter the number : ");
        num = input.nextInt();
        while (num > 0) {
            int rem = num % 10;
            num/=10;
            ans = ans*10+rem;

        }
        System.out.println(ans);
    }
}
