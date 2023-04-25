public class Area_Triangle {

    Arithmetics A;// entity reference

//    {
//        A= new Arithmetics();
//    }
    double triArea(double Base, double Height) {
        A= new Arithmetics();
        return A.half(A.mul(Base,Height));
    }

    public static void main(String[] args) {
        System.out.println(new Area_Triangle().triArea(4,15));
    }
}