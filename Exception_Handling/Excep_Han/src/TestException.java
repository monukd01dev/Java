public class TestException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
//            System.out.println(e);//default error message
//            custom error message
            System.out.println("Cannot Divide By Zero");
        }
        System.out.println("Program will continue..");
    }
}
