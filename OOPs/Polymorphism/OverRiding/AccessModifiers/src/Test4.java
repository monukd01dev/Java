public class Test4 extends Previous {
    void show() {
        super.invokePrivate();
        System.out.println("from test4");
    }

    public static void main(String[] args) {
        Test4 t1 = new Test4();
        t1.show();
    }
}
