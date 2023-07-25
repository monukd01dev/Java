//2.Write a Java program to find the sum of first 10 natural numbers.

public class SumTenNatNum {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i < 11; i++) {
            sum+=i;
        }
        System.out.println("Sum of first 10 Natural Numbers : "+sum);
    }
}
