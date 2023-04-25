package com.monu;

import java.util.Scanner;

public class Inpinjava {
    public static void main(String[] args) {
//        inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        System.out.print("Enter Your Number : ");
        int yourNum = input.nextInt();
        System.out.print("Enter Your Marks : ");
        float marks = input.nextFloat();
//        output
        System.out.println("Enter Your Name is " + name);
        System.out.println("Enter Your Number is " + yourNum);
        System.out.println("Enter Your Marks is " + marks);
    }
}