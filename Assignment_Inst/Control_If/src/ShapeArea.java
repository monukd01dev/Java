//21.Write a program in Java which is a Menu-Driven Program to compute the area of the various geometrical shape.
import java.sql.SQLOutput;
import java.util.Scanner;
public class ShapeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans, a, b,count=0;
        for (; ; ) {
            System.out.println("-----Choose The Shape From Given Menu-----\n1. Square\n2. Rectangle\n3. Triangle\n4. Circle\n------------------------------------------");
            System.out.print("Enter Your Choice : ");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> {
                    System.out.print("Enter the side of Square : ");
                    a = input.nextInt();
                    System.out.println("Area of Square is " + (a * a));
                }
                case 2 -> {
                    System.out.print("Enter the sides of Rectangle : ");
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println("Area of Square is " + (a * b));
                }
                case 3 -> {
                    System.out.print("Enter the Base and Height of Triangle : ");
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println("Area of Triangle : " + (a * b) / 2);
                }
                case 4 -> {
                    System.out.print("Enter the Radius of Circle : ");
                    a = input.nextInt();
                    System.out.println("Area of Circle : " + (a * a * 3.14159265359));
                }
                default -> {
                    if(count>1){
                        System.out.println("Are you a dick head or what...");
                    }
                    else{
                        System.out.println("Invalid Choice ::(");
                        count++;
                    }
                }
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
