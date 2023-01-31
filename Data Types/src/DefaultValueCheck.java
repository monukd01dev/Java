//This program print the default values of primitive and non primitive datatypes
public class DefaultValueCheck {
//    Class block
//    instance variable
//    primitive
//        Boolean
            boolean b;
//       Numeric
//            Integral
//                Integers
                    byte by;
                    short s;
                    int i;
                    long l;
//                character
                    char c;
//            Floating Point
                    float f;
                    double d;
 //   Static Variable
//     Non primitive(User defined)
            static String str;

    public static void main(String[] args){
//        function block or method block
//        creating object of class DefaultValueCheck
            DefaultValueCheck d1 = new DefaultValueCheck();
//            printing the default values
        System.out.println("Boolean : " + d1.b);
        System.out.println("Byte : " + d1.by);
        System.out.println("Short : " + d1.s);
        System.out.println("Integer : " + d1.i);
        System.out.println("Long : " + d1.l);
        System.out.println("Char : " + d1.c);
        System.out.println("Float : " + d1.f);
        System.out.println("Double : " + d1.d);
//        static variable accessing through class name
        System.out.println("String : " + DefaultValueCheck.str);




    }
}
