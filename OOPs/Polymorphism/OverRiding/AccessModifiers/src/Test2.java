class Previous {
    private void show() {
        System.out.println("from previous");
    }

    void invokePrivate() {
        show();
    }

}

class Test2 extends Previous {
    private void show() {
//        super.show();// here super will not work cause private things can't be accessed out of the class
        System.out.println("from next");
    }
    public static void main(String[] args) {
        Test2 n1 = new Test2();
        n1.show();

    }
}


