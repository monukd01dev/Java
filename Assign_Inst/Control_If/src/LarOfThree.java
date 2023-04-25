//7.Write a program to find the largest of three numbers.
import java.util.Scanner;
public class LarOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your three Numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if((a>b) && (a>c)){
            System.out.println(a+" is largest..");
        } else if ((b>a)&&(b>c)) {
            System.out.println(b+" is largest..");
        }else {
            System.out.println(c+" is largest..");
        }
    }
}
