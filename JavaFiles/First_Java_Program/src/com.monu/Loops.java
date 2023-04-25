package com.monu;
import java.lang.*;
import java.util.*;

public class Loops {
    public static void main(String[] args) {
        int count = 1;
//      while loop
        while (count != 5) {
            System.out.print(count);
            count++;
        }
//      For Loop
        for (int num = 1; num != 5; num++) {
            System.out.println(num);
        }
//        when to use these loops
//        when you don't know how many times the loop will run use while loop
//        when you know the count of iteration use for
//

//      ----------------------Syntax of Loops 1 by 1----------------------
//        while loop
//        while (condition){
//        #body
//        }

//        do while loop
//        do{
//            #body
//        }while(condition)

//        for loop
//        for(initialization;condition;increment/decrement){
//            #body
//        }
//
        //        WAP to print the n numbers enter by the user
//        in for loop
        System.out.println("Enter the Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
//        in while loop
        System.out.println("Enter the no. : ");
        int pn=1;
        int nom = input.nextInt();
        while(pn<=nom){
            System.out.println(pn);
            pn++;

        }
//        in do while loop
        int pn2=1;
        System.out.println("Enter your number please :");
        int sin = input.nextInt();
        do{
            System.out.println(pn2);
            pn2++;
        }while(pn2<=sin);

    }

}
