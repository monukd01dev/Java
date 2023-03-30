import java.util.concurrent.BlockingDeque;

public class Buds {
//    class variable
    static String brandName = "Boat";
//    instance variable
    String modelName;
    String color;
    float playTime;
    float bluetoothVersion;

    //    constructor(Parameterize)
    Buds(String modelName, String color, float playTime, float bluetoothVersion) {
        this.modelName=modelName;
        this.color=color;
        this.playTime=playTime;
        this.bluetoothVersion=bluetoothVersion;
    }

    //    user defined method
    void display() {
        System.out.println("Brand : "+brandName);
        System.out.println("Model : "+modelName);
        System.out.println("Color : "+color);
        System.out.println("PlayTime : "+playTime+"Hrs");
        System.out.println("BT Version : "+bluetoothVersion+"\n");
    }

    public static void main(String[] args) {
        Buds b1 = new Buds("Airdopes 161","Pebble Black",17f,5.1f);
        b1.display();
    }

}
