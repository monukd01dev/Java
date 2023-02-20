//5.Write a program in Java to display the cube of the number upto given an integer.
import java.util.Scanner;
public class CubeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp ;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        temp=num;
        for (int i = 0; i < 2; i++) {
            num*=temp;
        }
        System.out.println("Cube of "+temp+" is "+num);
    }

}

