public class Test3 extends Previous {
    public void show() {
//        super.show()// same reason given in test2
        System.out.println("from test3");
    }

    public static void main(String[] args) {
        Test3 t1 = new Test3();
        t1.show();
    }
}
