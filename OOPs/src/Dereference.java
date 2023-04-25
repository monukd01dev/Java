public class Dereference {
//    instance variable
    String name;
    String color;

    //    member functions
    void insertDetails(String p_name, String p_color) {
        name=p_name;
        color=p_color;
        display();
    }

    void display() {
        System.out.println("Pen name is "+ name+" and color is "+color);
    }
    public static void main(String[] args) {
//        new Main().insertDetails("Parker","Black").display();
        new Dereference().insertDetails("Parker","Black");
    }
}