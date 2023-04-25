/*
In TextException class we already know that the exception which will occur is ArithmeticException
but in situation where we don't know which exception will going to occur we create object of Exception Class
this make our handler Strong that can handle any exception but if you know which exception going to occur create their object that will reduce some cpu cycles or execution time...
*/
public class TestException1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program continues");
    }
}
