//19.Write a program in Java to read any Month Number in integer and display Month name in the word.
import java.util.Scanner;
public class WhichMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month : ");
        int month = input.nextInt();
        switch (month) {
            case 1 -> System.out.println("January"); //31
            case 2 -> System.out.println("February"); //28
            case 3 -> System.out.println("March");//31
            case 4 -> System.out.println("April");//30
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid :(");
        }
    }
}
