import java.util.Scanner;

//1.Write a program to accept two integers and check whether they are equal or not.
public class IntCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Taking inputs
        int num1,num2;
        System.out.print("Enter your First number : ");
        num1 = input.nextInt();
        System.out.print("Enter your Second number : ");
        num2 = input.nextInt();

        if (num1==num2){
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are unequal");
        }


    }

}

