class Back {
    Back show() {
        System.out.println("from back");
        return this;
    }
}
public class Front extends Back {
    Front show() {
        super.show();
        System.out.println("from front");
        return this;
    }
    public static void main(String[] args) {

        Front F1 = new Front();
        F1.show();
    }
}