import java.util.Scanner;

//15.Write a Java program to calculate profit and loss on a transaction.
public class ProfitLossCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sp,cp,profit,loss;
        System.out.print("Enter your CP : ");
        cp = input.nextDouble();
        System.out.print("Enter your SP : ");
        sp = input.nextDouble();
        if (sp>cp){
            System.out.println("Profit : "+(sp-cp)+"");

        }else {
            System.out.println("Loss : "+(cp-sp));
        }
    }
}
