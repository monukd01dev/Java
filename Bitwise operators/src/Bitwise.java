public class Bitwise {
    static boolean IsEvenAnd(int n){
        return ((n&1)==0);
    }
    static boolean IsEvenOr (int n){
        return ((n|1)>n);
    }static boolean IsEvenXor (int n){
        return ((n^1)>n);
    }
    public static void main(String[] args) {

//       &,|,<<,>>,>>>,~,^

//        odd or even using bitwise operators
        System.out.println((IsEvenAnd(112)) ? "true":"false");
        System.out.println((IsEvenOr(113)) ? "true":"false");
        System.out.println((IsEvenOr(112)) ? "true":"false");


}

}