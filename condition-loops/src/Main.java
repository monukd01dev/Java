import java.util.Scanner;
public class Main{
    public static boolean isPrime (int num){
        if (num==1) return false;
        for (int i =2; i <=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //    2 3 4 5 6 7 8 9 10
        //  prime divisible by 1 and itself
        int num = input.nextInt();

        System.out.println(isPrime(num));

    }

}
