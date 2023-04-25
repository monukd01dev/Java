public class TestCustomeException {
    static void div(int x, int y) throws MyException
    {
        if (y == 0) {
            throw new MyException("Can't divide number by 0 ");
        } else {
            System.out.println("Answer is "+(x/y));
        }
    }

    public static void main(String[] args){
        try{

        div(10,0);
        }
        catch (MyException a){
            System.out.println(a);
        }
        System.out.println("program will continue");

    }
}

