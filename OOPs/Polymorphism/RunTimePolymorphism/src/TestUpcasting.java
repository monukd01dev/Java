class Thetest {
    void show() {
        System.out.println("The compile time check");
    }
}
public class TestUpcasting extends Thetest {
    void show() {
        System.out.println("The runtime output");
    }

    public static void main(String[] args) {
        //upcasting
        Thetest tt = new TestUpcasting();
        tt.show();

    }
}


