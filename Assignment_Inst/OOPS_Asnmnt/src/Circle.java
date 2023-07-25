public class Circle {
    int radius;
    Circle() {
      radius=0;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area : "+3.14*radius*radius);
    }
    void circum() {
        System.out.println("Circumferance : " + (3.14 * 2 * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        c.area();
        c.circum();
    }
}
