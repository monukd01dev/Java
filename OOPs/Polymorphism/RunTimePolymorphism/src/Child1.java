// No overriding but upcasting
class Parent1 {
    void show() {
        System.out.println("From parent");
    }
}
public class Child1 extends Parent1{
    public static void main(String[] args) {
        Parent1 p1 = new Child1();
        p1.show();
    }
}
