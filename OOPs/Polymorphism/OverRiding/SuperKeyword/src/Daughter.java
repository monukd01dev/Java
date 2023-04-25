//2. Super can be used to invoke immediate parent class methods.
class Mother {
    void show() {
        System.out.println("From Mother");
    }

    void show2() {
        System.out.println("2nd Show");
    }
}
public class Daughter extends Mother {
    void show() {
        System.out.println("From Daughter");
        super.show();
        super.show2();//doing this is not worth it because show2 is already present in Daughter cause it extends Mother
    }
    public static void main(String[] args) {
        new Daughter().show();
        new Daughter().show2();// we use super in case of overriding only
    }
}
