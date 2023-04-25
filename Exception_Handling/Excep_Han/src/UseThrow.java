import java.util.Scanner;
class throwimplmnt{
    static void Vote(int x) throws MyException
    {
        if (x < 18) {
            throw new MyException("You are not eligible to vote");
        }
        else{
            System.out.println("welcome to vote");
        }

    }
}
public class UseThrow {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int x = input.nextInt();
        try {
            throwimplmnt.Vote(x);
        } catch (MyException a) {
            System.out.println(a);
        }
        System.out.println("Program will continue");
    }
}
