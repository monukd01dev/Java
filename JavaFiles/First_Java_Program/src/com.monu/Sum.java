package com.monu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
//        int result = num1+num2;
        System.out.println("Your sum is " + (num1+num2));
    }
}
