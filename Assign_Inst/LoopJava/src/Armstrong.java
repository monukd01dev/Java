//13.Write a Java program to check whether a given number is an armstrong number or not.
import javax.lang.model.element.NestingKind;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0,temp,rem,sum=0,remtemp;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        // temp variable to store the num value to perform evaluation on it
        temp=num;
//        for (int i =1;num>0;i++) {
//            rem=num%10;//for number extraction
//            num/=10;//for counting
//            System.out.println(rem);
//            count++;
//        }
//        System.out.println(count);
        //counter for digit counting
        while (temp > 0) {
            temp/=10;//reduce digit;
            count++; // counter will count the digit
        }
        temp = num;

        while (temp>0) {
            rem=temp%10;//collected the value
            remtemp=rem;//taking a remtemp for powering purpose
            // updating the number for next value
            temp/=10;
            for (int j = 1; j < count; j++) {//the powering loop always run 1 time less than the number count or u can assign the value as 1 at the point of initialization
                rem*=remtemp;
            }
            sum+=rem;

        }
        if (sum == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }
}
