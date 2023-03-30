public class CopyConstructor {
    //In java there is no copy constructor but we can make it as we do in cpp
//    there are three ways to copy one object into another object
//    1. through constructor
//    2. through reference
//    3. clone() method
    int a;
    int b;

    CopyConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // 1.through constructor
    CopyConstructor(CopyConstructor object) {
        a= object.a;
        b= object.b;
    }

    public CopyConstructor() {

    }

    void display() {
        System.out.println(a+"\t"+b);
    }

    public static void main(String[] args) {
        CopyConstructor cc1 = new CopyConstructor(2, 3),cc2,cc3,cc4= new CopyConstructor();
        cc2 = new CopyConstructor(cc1);
        cc2.display();
        cc1.display();
//        2.through reference id
        cc3 = new CopyConstructor(4, 5);
        cc4.a = cc3.a;
        cc4.b = cc3.b;
        cc3.display();
        cc4.display();
//        3. clone method

    }

}

