class Base{
    int x = 100;
}
public class DataOverWrite extends Parent{
    //Data Overwrite
    int x = 200;

    public static void main(String[] args) {
        System.out.println(new DataOverWrite().x);// priority goes to local

    }

}
