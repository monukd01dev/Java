//6.Write a program to accept the height of a person in centimeter and categorize the person according to their height.

import java.util.Scanner;

public class HeightCateg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in CM : ");
        int height = input.nextInt();
        if (height<150){
            System.out.println("You came under Dwarfs :(");
        } else if ((height > 150) && (height <= 165)) {
            System.out.println("You are an average :|");
        }
        else {
            System.out.println("You are tall...");
        }

    }
}
