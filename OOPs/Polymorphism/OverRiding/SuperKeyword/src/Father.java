//3. super() can be used to invoke immediate parent class constructor
//  Constructors are never inherited
class Demo{
    static{
        System.out.println("Demo static");
    }
}
class GrandFather {
    GrandFather() {
        this(10);
        System.out.println("GrandFather Constructor");
    }
    static {
        System.out.println("From GrandFather static");
    }

    GrandFather(int x) {
        System.out.println(x);
    }
    {
        System.out.println("GrandFather init block");
    }
}
public class Father extends GrandFather {

    Father() {
        super(); // this code is implicitly added by technology, as we know that constructor of child class calls constructor of its parent class before executing its code
        // it is mandatory to put super() in the first line of your constructor
        System.out.println("Father Constructor");
    }
    static {
        System.out.println("from static");
    }
    // what will output if we put an init block?
    // we know that output of init block come before constructor code and this()
    // but in the case of super() all changed
    // no super() ==> inti block > this() > other code.
    // with super() ==> super() > inti block > this() > other code.
    // with static block ==> static block of parent > static block of child > super() > inti block > this() > other code.

    // thing to know Classes which haven't any parent by default whose parent is Object class so when Father constructor run it calls it parent constructor which is GrandFather and when GrandFather Constructor is invoked it implicitly invoked its parent class constructor which is Object class Constructor, but we didn't get any output cause that constructor is empty.

    {
        System.out.println("Father init Block");
    }


    public static void main(String[] args) {
        new Father();
    }
}
