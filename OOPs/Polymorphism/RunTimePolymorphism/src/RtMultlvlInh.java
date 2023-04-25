// RunTime Polymorphism with multilevel Inheritance
class Kalesh {
    void wakeUpTime() {
        System.out.println("kalesh");
    }
}
class Dada extends Kalesh{
    void wakeUpTime() {
        System.out.println(4);
    }
}

class Papa extends Dada {
    @Override
    void wakeUpTime() {
        System.out.println(6);
    }
}

class Pota extends Papa{
    @Override
    void wakeUpTime() {
        System.out.println(9);
    }
}
public class RtMultlvlInh {
    public static void main(String[] args) {
        Kalesh k1 = new Dada();
        k1.wakeUpTime();
        Papa p1 = new Pota();
        p1.wakeUpTime();
        k1 = new Pota();
        k1.wakeUpTime();

    }

}
