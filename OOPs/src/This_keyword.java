public class This_keyword {
    int num;
    String name;
    void insertDetail(int num, String name) {
        this.num=num;
        this.name=name;
        display();
    }

    void display() {
        System.out.println(num + " " + name);
    }
    public static void main(String[] args) {
        new This_keyword().insertDetail(12,"naam");
    }
}

