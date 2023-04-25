//Initialize instance Variable by constructor
public class Demo {
//    instance variable
        int x;
        int y;

        Demo() {
            x=100;
            y=200;
            System.out.println(x);
            System.out.println(y+"\n");
            
        }
    public static void main(String[] args) {

//            object creation
        Demo d = new Demo();
        Demo d1 = new Demo();
        Demo d2 = new Demo();

    }
}