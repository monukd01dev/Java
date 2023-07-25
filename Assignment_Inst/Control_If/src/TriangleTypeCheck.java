//11.Write a Java program to check whether a triangle is Equilateral, Isosceles or Scalene.
import java.util.Scanner;
public class TriangleTypeCheck {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        float a,b,c;
        System.out.print("Enter the parameters of Triangle : ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        if (a==b && b==c){
            System.out.println("Equilateral");
        }
//        else if ((a==b || a==c) && b!=c)
        else if((a!=b && b!=c) && (a!=c))
        {
            System.out.println("Scalene");
        }
        else {
            System.out.println("Isosceles");
        }
    }
}
