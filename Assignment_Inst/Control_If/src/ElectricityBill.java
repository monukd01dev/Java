//16.Write a program in Java to calculate and print the Electricity bill of a given customer. The customer id., name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer. The charge are as follow :
//
//        Unit	                                                                                    Charge/unit
//        upto 199	                                                                                        @1.20
//        200 and above but less than 400	                                        @1.50
//        400 and above but less than 600	                                        @1.80
//        600 and above	                                                                        @2.00
//        If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int customer_id;
        double unit,pay=0;
        String name;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your Customer ID : ");
        customer_id = input.nextInt();
        System.out.print("Enter your consumption : ");
        unit = input.nextDouble();
//        condition
        if (unit<84){
            pay = 100;
        }else{
            if(unit<200){
                pay = unit*1.20;
            }else if(unit<400){
                pay = unit*1.50;
            }else if(unit<600){
                pay = unit*1.80;
            }else if(unit>600){
                pay = unit*2;
            }

        }
        if (pay>400){
//            System.out.println(pay);
            pay += pay*0.15;
//            System.out.println(pay);
        }
        System.out.println("You have to pay : "+pay);
    }

}
