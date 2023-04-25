import java.lang.management.GarbageCollectorMXBean;

class App{
    String name;
    float rating;
    String downloads;
    int rated;

    void display() {
        System.out.println("App Name : " + name);
        System.out.println("Ratings : "+rating);
        System.out.println("Downloads : "+downloads);
        System.out.println("Rated : "+rated+"+\n");
    }
}

class Dream11 extends App {
    Dream11(String name, float rating, String downloads, int rated) {
        this.name=name;
        this.rating=rating;
        this.downloads=downloads;
        this.rated=rated;
    }
}

class Paytm extends App {
    Paytm(String name, float rating, String downloads, int rated) {
        this.name=name;
        this.rating=rating;
        this.downloads=downloads;
        this.rated=rated;
    }
}

class Gpay extends App {
    Gpay(String name, float rating, String downloads, int rated) {
        this.name=name;
        this.rating=rating;
        this.downloads=downloads;
        this.rated=rated;
    }
}

public class HierarchiacalInhrtnc {
    public static void main(String[] args) {
        Dream11 d1 = new Dream11("Dream 11",4.3f,"10M+",18);
        d1.display();
        Paytm p1 = new Paytm("Paytm",4.5f,"100M+",3);
        p1.display();
        Gpay g1 = new Gpay("Google Pay",4.3f,"500M+",3);
        g1.display();
    }
}
