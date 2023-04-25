class Old {
    public void show() {
        System.out.println("From old");
    }
}

class New extends Old {

//    protected void show() {
//        System.out.println("From new");
//    }

}

public class Test1 {
    public static void main(String[] args) {

        New n1 = new New();
        n1.show();
//        give error at compile time cause weaker access modifier protected trying to override stronger access modifier public
    }
}