// no overriding calling child personal method upcasting is done
class Parent2 {
    void show() {
        System.out.println("From Parent2");
    }
}
public class Child2 extends Parent2{
    void personal() {
        System.out.println("child personal");
    }

    public static void main(String[] args) {
        //upcasting
        Parent2 p1 = new Child2();
//        p1.personal(); //fails at compile time
//        if you have to run child class personal method you need to do down-casting.
        //down-casting
        Child2 c2 = (Child2)p1;
        c2.personal();
    }
}
