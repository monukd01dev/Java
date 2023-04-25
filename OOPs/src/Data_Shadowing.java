public class Data_Shadowing {
    int num;
    String name;
    void insertDetail(int num, String name) {
        num=num;
        name=name;
        display();
    }

    void display() {
        System.out.println(num + " " + name);
    }
    public static void main(String[] args) {
        new Data_Shadowing().insertDetail(12,"naam");
    }
}
