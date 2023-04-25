public class ToStringOvride {
    public String toString() {
        return "Own made message";
    }

    public static void main(String[] args) {
        ToStringOvride t = new ToStringOvride();
        System.out.println(t);
    }
}
