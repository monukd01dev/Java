public class ConsChain {
    ConsChain() {
        System.out.println(1);
    }

    ConsChain(int x) {
        this();
        System.out.println(2);
    }

    ConsChain(int x, int y) {
        this(1);
        System.out.println(3);
    }

    ConsChain(int x, int y,int z) {
        this(1,2);
        System.out.println(4);
    }

    ConsChain(int x, int y,int z,int aplha) {
        this(1,2,3);
        System.out.println(5);
    }

    public static void main(String[] args) {
        new ConsChain(1, 2, 3, 3);
    }


}
