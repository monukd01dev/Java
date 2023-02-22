//14.Write a Java program to find the Armstrong number for a given range of number.
import java.util.Scanner;
public class ArmstrgRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0,temp,rem,sum=0,remtemp,start,end;
        System.out.print("Enter your Range : ");
        start = input.nextInt();
        end = input.nextInt();
        for(int k=start;k<=end;k++) {
            // temp variable to store the k value to perform evaluation on it
            temp = k;

//        System.out.println(k);
            //counter for digit counting
            while (temp > 0) {
                temp /= 10;//reduce digit;
                count++; // counter will count the digit
            }
            temp = k;

            while (temp > 0) {
                rem = temp % 10;//collected the value
                remtemp = rem;//taking a remtemp for powering purpose
                // updating the number for next value
                temp /= 10;
                for (int j = 1; j < count; j++) {//the powering loop always run 1 time less than the number count or u can assign the value as 1 at the point of initialization
                    rem *= remtemp;
                }
                sum += rem;

            }
            if (sum == k) {
                System.out.print(k + "\t");
            }
            // don't forget to update the values of count and sum these have to change for every number cause its check for every nubmer
            count=0;
            sum=0;
        }
    }
}
