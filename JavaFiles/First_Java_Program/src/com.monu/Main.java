package com.monu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); //here by default out is null, means command line.
        // you can change out to a file also in that case out is not null.
        System.out.println("My name is MonuKD");
//        how to take inputs in java
//        we have to import java.util.Scanner
        Scanner input = new Scanner(System.in);//system.in means standard input stream(keyboard)
        //input is our variable Scanner(System.in) is a constructor that initializing input with standard input
        // input is an object of Scanner class
//        System.out.println(input.nextInt());
//        input.nextInt() take input as integer
//        System.out.println(input.next());
//        this will input the first string (word)
        System.out.println(input.nextLine());
//        this will input the entire the line
        
    }
}