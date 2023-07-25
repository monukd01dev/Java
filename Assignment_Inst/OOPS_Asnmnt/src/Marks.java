public class Marks {
    private int a,b,c;
    Marks() {
        a=0;
        b=0;
        c=0;
    }

    void in(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    int sum() {
        return (a+b+c);
    }

    int avg() {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.a=60;
        m1.in(10,20,30);
        System.out.println("Total Marks : " + m1.sum());
        System.out.println("Average Marks : " + m1.avg());
    }

}
