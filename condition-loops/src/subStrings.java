
class People{
    String name;
    int age;
    String occupation;

    // methods
    public void detail(){
        System.out.println("My Lord! I am "+this.name +"and my age is "+this.age+", I am a "+this.occupation+".");
    }

    // constructors
    // non-prameterised
    People(){
        System.out.println("Constructor is called");
    }
    // parameterised
    People(String name,int age, String occupation ){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    // copy-const.
    People(People p1){
        this.name = p1.name;
        this.age = p1.age;
        this.occupation = p1.occupation;
    }
}

public class subStrings{
    public static void main (String[] args){

        // creating an object of People
        People p1 = new People();
        System.out.println("hellow there");

    }


}