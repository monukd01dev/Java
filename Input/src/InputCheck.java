import java.util.Scanner;
public class InputCheck {
    public static void main(String[] args) {
//        input integer
//        nextInt() // nonStatic if we have to use this method we have to create an object of scanner class

//        Scanner class
//        creating object of scanner class
//        className VariableName = new className(Parameter);
          Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = input.nextInt();
        System.out.println(a);

    }
}
