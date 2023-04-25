package com.monu;
import java.util.Scanner;
public class TypeCasting {
//    When one type of data is assign to another type of variable
//    an automatic type conversion will take place if the following
//    conditions are met:
//    1. Type should be compatible.
//    2. Destination type should be greater than the source type.
//    what ever on the left-hand side should be bigger than the Right-hand side.
//    -> you are asking for smaller but giving something bigger will not work.
//    -> if you have something bigger and asking for smaller will work.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat(); // but I'll give input as integer
//        System.out.println(num); // in this case TypeConversion happen because of the 2nd condition.
////        int num1 = input.nextFloat();// this will give an error incompatible
////        now we do the TypeCasting manually
////        Auto-matic TypeConversion is good but it'll not fulfill all the needs
//        int num1 = (int)(25.5f);// don't write in wrong way like int(25.5)
//        System.out.println(num1);
//
//        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);// 257 % 256 = 1

        //some shit
        char letter = 65;
        System.out.println(letter);

//        Type promotion rules in expression
//        1. All byte char short values promoted to integer.
//        2. If any of the operands in expression is float or long the whole operation will promote to long or float
    }

}
