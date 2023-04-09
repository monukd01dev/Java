//Method Hiding
class Dad {
    static void show() {
        System.out.println("From Dad");
    }
}
public class Son1 extends Dad {
    static void show() {
        System.out.println("From Child");
    }
    public static void main(String[] args) {

        show();//priority goes to whom from whose main method calls the static method
        Dad.show();
        Son1 m1 = new Son1();
        m1.show(); // also can be called through instance

    }
}