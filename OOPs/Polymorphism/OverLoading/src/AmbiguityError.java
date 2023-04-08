// this programme shows the Ambiguity Error in Compile time polymorphism
public class AmbiguityError {
    static int sum(int num1, long num2) { //first one
        return (int) (num1+num2);
    }

    static int sum(long num1, int num2) { //second one
        return (int) (num1 + num2);
    }

    public static void main(String[] args) {
        System.out.println(sum(2,5));//this show ambiguous method call because for both the arguments typePromotion can be done
        //Error : java: reference to sum is ambiguous

        System.out.println(sum(2L,5));// this is not showing any error because no implicit typePromotion is needed I have clearly specified that which function will call it'll call second sum method
        System.out.println(sum(2,5L)); //And this so...
        // doing vice versa in parameters to achieve compileTime polymorphism is not a good option it'll lead you to errors
    }
}
