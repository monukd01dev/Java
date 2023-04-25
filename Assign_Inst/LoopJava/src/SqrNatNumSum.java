//10.Write a program in Java to display the n terms of square natural number and their sum.
import java.util.Scanner;
public class SqrNatNumSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0,temp;
        System.out.print("Enter the Range : ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            temp = i*i;
            sum+=temp;
            System.out.print(temp+"\t");
        }
        System.out.println("\nThe sum : "+sum);
    }
}
