public class Counter {
    static int x;
    static{// this block run before main method
          x =1;
}
    Counter() {
        System.out.println(x);
        x++;
    }

    public static void main(String[] args) {
        new Counter();//1
        new Counter();//2
        new Counter();
        new Counter();
        new Counter();
        new Counter();//6
    }
}
