//12.Write a Java program to check whether a triangle can be formed by the given value for the angles.
import java.util.Scanner;
public class TriangleCanBe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,sum=180;
        System.out.print("Enter the angles : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if ((a+b+c)==sum){
            System.out.println("Triangle can be formed...");
        }else {
            System.out.println("Nahh!! no chance...");
        }

    }
}
