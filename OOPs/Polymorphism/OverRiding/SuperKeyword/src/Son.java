// 1. Super can be used to refer immediate parent class instance variable.
class Dad {
    int x = 100;

    void show() {
        System.out.println("From Daddy...");
    }
}

public class Son extends Dad {
    int x = 200;

    void show() {
        System.out.println("From Son");
        System.out.println(x);
        System.out.println(super.x);
    }
    public static void main(String[] args) {
          new Son().show();
//        System.out.println(super.x); // super cannot be referenced through static context

    }
}