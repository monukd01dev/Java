class Parent{
    void show() {
        System.out.println("From Parent");
    }
}

public class Child extends Parent {
    //Override
    void show() {
        System.out.println("From Child");
    }
    public static void main(String[] args) {
        // in case of inheritance always create the object of child because automatically all features of parent class came into the child class
        new Child().show(); // this will show the output of child class cause priority always goes to local
    }
}
