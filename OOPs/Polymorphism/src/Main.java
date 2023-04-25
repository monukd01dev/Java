//overloading
public class Main {

    public static int sum(int x, int y)//change
    {
        return (x+y);
    }
    public static float sum(float x, float y)//change
    {
        System.out.println("float called");
        return (x+y);
    }
    public static int sum(int x, int y, int z) {
        return (x+y+z);
    }

    public static void main(String[] args) {
//        there are two ways to achieve polymorphism
//        1. by changing return type.
//        2. by changing parameter list.
//
        System.out.println(sum(4.0f,5.0f));
    }

}