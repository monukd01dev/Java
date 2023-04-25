//20.Write a program in Java to read any Month Number in integer and display the number of days for this month.
import java.util.Scanner;
public class DayInMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month : ");
        int month = input.nextInt();
        switch (month){
            case 2 :
                System.out.println("Have 28 Days...");
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Have 31 Days...");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Have 30 Days...");
                break;
            default:
                System.out.println("Invalid :(");
        }
    }
}
