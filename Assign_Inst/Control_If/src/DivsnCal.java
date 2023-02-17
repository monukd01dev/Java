//9.Write a program to read roll no, name and marks of three subjects and calculate the total, percentage and division.
import java.sql.SQLOutput;
import java.util.Scanner;
public class DivsnCal {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        String name;
        int roll_no,totalm,s1,s2,s3;
        float percentage;
//        console input
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your Roll No : ");
        roll_no = input.nextInt();
        System.out.print("Enter your marks : ");
        s1 = input.nextInt();
        s2 = input.nextInt();
        s3 = input.nextInt();
//        calculations
        totalm = s1+s2+s3;
        percentage = totalm/3;
        System.out.println("-------------------------------------------------");
//       console outputs
        System.out.print(name+" Roll no "+
                roll_no+"\nTotal Marks : " +totalm
                +"\nPercentage : "+percentage
                +"\nDivision : ");
//        division conditions
        if (percentage>=80){
            System.out.println("Distinction");
        }
        else if (percentage>=60){
            System.out.println("First Division");
        }
        else if (percentage>=50){
            System.out.println("Second Division");
        }
        else if (percentage>=40){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail Shit!!");
        }
    }
}
