public class Temp {

//    constructor
    Temp() {
        System.out.println("First constructor 1");
    }

//    Init Block
{
    System.out.println("First init block a");
}

    Temp(int x) {
        System.out.println("Second Constructor 2");
    }
    {
        System.out.println("2nd Init block");
    }

    public static void main(String[] args) {

//        System.out.println("Hello world!");
        new Temp();
        new Temp(2);
    }

}