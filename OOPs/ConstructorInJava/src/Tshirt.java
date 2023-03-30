public class Tshirt {
    //    Instance Variables
    String fabric;
    String fit;
    String pattern;
    String sleeve;
    double price;
    char size;

    //    Parameterize Constructor
    Tshirt(String fabric, String fit, String pattern, String sleeve, double price, char size) {
        this.fabric=fabric;
        this.fit=fit;
        this.pattern=pattern;
        this.sleeve=sleeve;
        this.size=size;
        this.price=price;
    }

     void display() {
        System.out.println();
        System.out.println("Fabric  :  "+fabric);
        System.out.println("Fit     :  "+fit);
        System.out.println("Pattern :  "+pattern);
        System.out.println("Sleeve  :  "+sleeve);
        System.out.println("Size    :  "+size);
        System.out.println("Price   :  "+price);
    }

    public static void main(String[] args) {
        Tshirt t1 = new Tshirt("Cotton Blend","Regular","Solid","Half Sleeve",949,'M');
        t1.display();
    }

}
