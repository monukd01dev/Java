import java.util.Scanner;

public class Array {
    final int[] arr = new int[5];

    void fill() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Values Added Successfully...");
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
            System.out.println("");
    }

    void max() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum is : " + max);
    }

    void min() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimun is : " + min);
    }

    public static void main(String[] args) {
        Array a1 = new Array();
        a1.fill();
        a1.display();
        a1.max();
        a1.min();
    }
}
