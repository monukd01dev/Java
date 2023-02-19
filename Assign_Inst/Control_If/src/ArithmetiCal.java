//22.Write a program in Java which is a Menu-Driven Program to perform a simple calculation.
import java.util.Scanner;
public class ArithmetiCal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,ch;

        for (;;){
//            choice collector
            System.out.println("-----Choose The Shape From Given Menu-----\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n------------------------------------------");

//            input taking
            System.out.print("Enter your First Num : ");
            a = input.nextInt();
            System.out.print("Enter your Second Num : ");
            b = input.nextInt();
            System.out.print("Enter Your Choice : ");
            ch = input.nextInt();
//            Now Switch cases
            switch(ch){
                case 1 -> {
                    System.out.println("Addition of "+a+" and " +b+ " is " +(a+b)+".");
                }
                case 2 -> {
                    System.out.println("Subtraction of "+a+" and " +b+ " is " +(a-b)+".");
                }
                case 3 -> {
                    System.out.println("Multiplication of "+a+" and " +b+ " is " +(a*b)+".");
                }
                case 4 -> {
                    System.out.println("Division of "+a+" and " +b+ " is " +(a/b)+".");
                }
                default -> System.out.println("invalid :( ");
            }
            System.out.print("Do You Want to do it Again (Y/N) : " );
            char again = input.next().charAt(0);
            if(again == 'y' || again == 'Y'){
                continue;
            }
            else{
                break;
            }
        }
    }
}
