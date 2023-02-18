//18.Write a program in Java to read any day number in integer and display day name in the word.
import java.util.Scanner;
public class DayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day : ");
        int day = input.nextInt();
        switch(day){
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
            case 11 -> System.out.println("Eleven");
            case 12 -> System.out.println("Twelve");
            case 13 -> System.out.println("Thirteen");
            case 14 -> System.out.println("Fourteen");
            case 15 -> System.out.println("Fifteen");
            case 16 -> System.out.println("Sixteen");
            case 17 -> System.out.println("Seventeen");
            case 18 -> System.out.println("Eighteen");
            case 19 -> System.out.println("Nineteen");
            case 20 -> System.out.println("Twenty");
            case 21 -> System.out.println("Twenty One");
            case 22 -> System.out.println("Twenty Two");
            case 23 -> System.out.println("Twenty Three");
            case 24 -> System.out.println("Twenty Four");
            case 25 -> System.out.println("Twenty Five");
            case 26 -> System.out.println("Twenty Six");
            case 27 -> System.out.println("Twenty Seven");
            case 28 -> System.out.println("Twenty Eight");
            case 29 -> System.out.println("Twenty Nine");
            case 30 -> System.out.println("Thirty");
            case 31 -> System.out.println("Thirty One");
            default -> System.out.println("Invalid :(");

        }
    }
}
