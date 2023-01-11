import java.util.Scanner;

public class array {
    static void reverse( int[] arr, int m){
        for(int i = 0; i < arr.length; i++){
            if(i==m+1){
                for(int j=arr.length-1; j >m ;j--){
                    System.out.print(arr[j]+" ");
                }
                break;
            }
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x = inp.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = inp.nextInt();
        }
        reverse(arr,x);
    }
}
