import java.util.*;
public class rotate {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int x = input.nextInt();

//         output

        for(int i=0; i<arr.length; i++){
            if(i==x){
                for(int j=x; j<arr.length ; j++){
                    arr[j]=arr[j+1];

                }
                break;
            }
        }
        for(int i : arr){
            System.out.print(i);
        }
    }
}
