//16.Write a program in Java to find the prime numbers within a range of numbers.
import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,end,c=2,count=0;
        System.out.print("Enter your Range : ");
        start = input.nextInt();
        end = input.nextInt();
        for (int i = start; i <= end; i++) {
            while ((c * c) <= i) {
                if ((i%c) ==0) {
                    count++;
                    break;
                }
                c+=1;
            }
            if (count==0) {
                System.out.print(i+"\t");
            }
            count=0;
            c=2;
        }
    }
}
