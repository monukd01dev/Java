class Parent{
    int x;
    int y;
    void get() {
        System.out.println(x+"\t"+y);
    }

}

public class Child extends Parent{

    Child(int x, int y) {
        this.x=x;
        this.y=y;
    }
    void set(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {

        Child c1 = new Child(1, 2);
        c1.get();
        c1.set(2,2);
        c1.get();

    }
}