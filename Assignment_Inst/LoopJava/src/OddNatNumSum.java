//7.Write a program in Java to display the n terms of odd natural number and their sum .
import java.sql.SQLOutput;
import java.util.Scanner;
public class OddNatNumSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0;
        System.out.print("Enter the Range : ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if ((i % 2) != 0) {
                System.out.print(i+"\t");
                sum+=i;
            }
        }
        System.out.println("\nThe sum : "+sum);
    }
}
