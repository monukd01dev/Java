public class Main {
    final int om ;
    {
        om = 4;
    }
    final static int dm ;
    static {
        dm=12;
    }
    public static void main(String[] args) {

        System.out.println(new Main().om);
        System.out.println(Main.dm);
    }
}