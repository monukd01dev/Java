//10.Write a Java program to read temperature in centigrade and display a suitable message according to temperature state below :
//
//        Temp < 0 then Freezing weather
//        Temp 0-10 then Very Cold weather
//        Temp 10-20 then Cold weather
//        Temp 20-30 then Normal in Temp
//        Temp 30-40 then Its Hot
//        Temp >=40 then Its Very Hot
import java.util.Scanner;
public class WhatsTheWeather {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature : ");
        int temp = input.nextInt();
        if (temp<=0){
            System.out.println("Freezing");
        } else if (temp<10) {
            System.out.println("Very cold");
        } else if (temp<20) {
            System.out.println("Cold");
        }else if (temp<30) {
            System.out.println("Normal");
        }else if (temp<40) {
            System.out.println("Hot");
        }else {
            System.out.println("Its very hot");
        }
    }

}
