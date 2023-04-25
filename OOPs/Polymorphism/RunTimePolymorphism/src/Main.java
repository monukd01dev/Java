class Bank {
    float getrateofinterest() {
        return 0;
    }
}

class SBI extends Bank{
    float getrateofinterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getrateofinterest() {
        return 5.5f;
    }
}

class AXIS extends Bank {
    float getrateofinterest() {
            return 4.5f;
    }
}

public class Main {
    public static void main(String[] args) {

        Bank b1 = new SBI(),b2 = new ICICI(),b3 = new AXIS();
        System.out.println(b1.getrateofinterest());
        System.out.println(b2.getrateofinterest());
        System.out.println(b3.getrateofinterest());
    }
}