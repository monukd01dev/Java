//17.Write a program in Java to display the first n terms of Fibonacci series.
import java.util.Scanner;
public class FibonacciNTerm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.print("The the value of n : ");
        n = input.nextInt();
        if (n < 3) {
            if (n == 1) {
                System.out.println(a);
            } else {
                System.out.println(a + "\t" + b);
            }

        } else {
            System.out.print(a + "\t" + b + "\t");
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(c + "\t");
                a = b;
                b = c;
            }
        }
    }
}

