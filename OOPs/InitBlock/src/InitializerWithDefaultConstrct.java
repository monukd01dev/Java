public class InitializerWithDefaultConstrct {
    int x,y;
    {
        //We use this in case of Data Shadowing only
        x=4;
        y=6;
        //here we don't have to make constructor to do this it attaches with the default constructor...
        //and that's what I am Experimenting
        //class name really SUCKS!
    }

    public static void main(String[] args) {
        InitializerWithDefaultConstrct ob1 = new InitializerWithDefaultConstrct();
        System.out.println(ob1.x+""+ob1.y);
    }
}
