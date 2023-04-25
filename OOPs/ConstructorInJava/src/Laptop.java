// Here I use Constructor chaining to re-usability
// constructor chaining real life example
public class Laptop {

    // instance variable
    String Brand;
    float Price;
    int Ram;
    String Graphic;
    int Vram;

    Laptop(String Brand,float Price,int Ram){
        this.Brand=Brand;
        this.Price= Price;
        this.Ram=Ram;

        System.out.println(Brand);
        System.out.println(Price);
        System.out.println(Ram);
    }
    Laptop(String Brand, float Price,int Ram,String Graphic, int Vram){
        this( Brand, Price, Ram);
        this.Graphic=Graphic;
        this.Vram=Vram;
        System.out.println(Graphic);
        System.out.println(Brand);

    }

    public static void main(String[] args){

        new Laptop("Asus",47990,8,"Rtx394",16);

    }

}
