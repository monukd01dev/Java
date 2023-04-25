
public class Main {

    static String FlamesCheck(String Girl, String Boy) {

        return Flames.play(Girl, Boy);
    }
    static String FlamesCheck(String Girl, String Boy,String Boy1) {
        String ans = Flames.play(Girl, Boy);
        String ans2 = Flames.play(Girl, Boy1);
        return (ans+" "+ans2);
    }
    public static void main(String[] args) {

        System.out.println(FlamesCheck("Sita","Ram"));
        System.out.println(FlamesCheck("krishna","radha","rukmani"));
    }
}