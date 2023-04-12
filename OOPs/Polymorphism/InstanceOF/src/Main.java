class Human {
    void walk() {
        System.out.println("Human walks");
    }
}

class Boy extends Human{
    void walk() {
        System.out.println("Boy Walks");
    }
}
public class Main {
    public static void main(String[] args) {

        Human H1 = new Boy();
//        Human H1 = new Human();
        System.out.println(H1 instanceof Human);
        System.out.println(H1 instanceof Boy);
        H1.walk();
        if (H1 instanceof Boy) {
            Boy B1 = (Boy) H1;
            B1.walk();
        }

    }
}