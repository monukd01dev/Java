//       1. Write a program to print whether a number is even or odd, also take input from the user.
//       2. Take name as input and print a greeting message for that particular name.
//       3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//       4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//       5. Take 2 numbers as input and print the largest number.
//       6. Input currency in rupees and output in USD.
//       7. To calculate Fibonacci Series up to n numbers.
//       8. To find out whether the given String is Palindrome or not.
//       9. To find Armstrong Number between two given number.

import java.util.Scanner;
import java.lang.Math;

public class FirstJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1. Solution
//        System.out.print("Enter the number you want to check : ");
//        int num = input.nextInt();
//        if (num%2 == 0){
//            System.out.println(num+" is an Even number.");
//        }
//        else {
//            System.out.println(num+" is an Odd number.");
//        }

//        2.Solution
//        System.out.print("Please Enter Your Good Name : ");
//        String name = input.nextLine();
//        System.out.println("Hi, "+name);

//        3.Solution
//        System.out.println("----Simple Interest Calculator----");
//        System.out.print("Enter the Principal amount : ");
//        float p = input.nextFloat();
//        System.out.print("Enter the Rate of Interest : ");
//        float r = input.nextFloat();
//        System.out.print("Enter the Time Period : ");
//        float t = input.nextFloat();
//        System.out.println("Your SI is : "+(p*r*t)/100);

//        4. Solution
//        System.out.println("Enter the numbers : ");
//        float num1 = input.nextFloat();
//        char sign = input.next().charAt(0);
//        float num2 = input.nextFloat();
//        if(sign == '+' ){
//            System.out.println("your Sum is "+ (num1+num2));
//        } else if (sign == '-') {
//            System.out.println("your Subtract is "+ (num1-num2));
//        } else if (sign == '*') {
//            System.out.println("your Multiplication is "+ (num1*num2));
//        } else if (sign == '/') {
//            System.out.println("your Division is "+ (num1/num2));
//        }

//        5. Solution
//        System.out.print("Enter the Numbers : ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        if(num1>num2){
//            System.out.println(num1+" is bigger than "+num2);
//        }
//        else if (num1 == num2){
//            System.out.println("Numbers are equal");
//        }
//        else {
//            System.out.println(num2+" is bigger than "+num1);
//        }

//        6. Solution
//        System.out.print("Enter the INR : ");
//        float inr = input.nextFloat();
//        float usd = 82.42f;
//        System.out.println("USD : "+(inr/usd));

//        7. Solution
//        System.out.print("Enter the number : ");
//        int n = input.nextInt();
//        //for printing any no in fibonacci we required previous 2 numbers that's why I declared num1 and num2 with two no of series.
//        // the formula of fibonacci => Fn = F(n-1) + F(n-2).
//        int num1 = 0;
//        int num2 = 1;
//        int num3;
//        if (n==1){
//            System.out.println(num1);
//        } else if (n==0) {
//            System.out.println("chutiya hai kya laude");
//        } else {
//            System.out.println(num1 + "\n" + num2);
//        }
//        for (int i =2; i<n; i++){
//            num3 = num2 + num1;
//            System.out.println(num3);
//            num1=num2;
//            num2=num3;
//        }

//        8. Solution

//        System.out.print("Enter Your String/Number : ");
//        String nonrev = input.nextLine();
////        String rev="";
//        int h = nonrev.length()-1,i =0;
//        while(h>i){
//            if (nonrev.charAt(i++) != nonrev.charAt(h--)){
//                System.out.println("is not palindrome.");
//                h=0;
//            }
//        }
//        if (h!=0){
//            System.out.println("is palindrome.");
//        }
//
////        for (int i=nonrev.length()-1;i>=0; i--){
////            rev = rev + nonrev.charAt(i);
////        }
////        if (rev.equals(nonrev)){
////            System.out.println("This is a Palindrome String.");
////        }
////        else{
////            System.out.println("This is not a Palindrome String.");
////        }

//        9. Solution
       int n,r,temp,sum=0;
       System.out.println("Enter Your Number : ");
       n=input.nextInt();
       temp = n;
       while(n>0){
           r=n%10;
//           sum= sum+(r*r*r);
           n=n/10;
       }
       if (sum == temp){
           System.out.println("Armstrong.");
       }
       else{
           System.out.println("not an Armstrong.");
       }

    }
}