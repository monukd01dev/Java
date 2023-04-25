//12.Write a Java program to find the perfect numbers within a given number of range.
import java.util.Scanner;
public class PerfectNumRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,end,sum=0;
        System.out.print("Enter your Range : ");
        start = input.nextInt();
        end = input.nextInt();
            for (int k = start; k <= end; k++) {

                for (int i = 1; i < k; i++) {
                    if ((k % i) == 0) {
                        sum+=i;
                    }
                }
                if (sum == k) {
                    System.out.print(k + "\t");
                }
                sum=0;
            }
        }

}
