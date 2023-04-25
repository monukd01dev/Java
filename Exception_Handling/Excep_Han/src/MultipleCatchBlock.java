public class MultipleCatchBlock {
    public static void main(String[] args) {

        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program continues");


    }
}
