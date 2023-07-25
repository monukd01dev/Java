import java.util.Scanner;

// Write a program of flames
public class Flames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boy_ch,girl_ch,counter=0;
        System.out.print("Enter your name : ");
        String boy = input.next();
        System.out.print("Enter your crush name : ");
        String girl = input.next();
        boy_ch = boy.length();
        girl_ch = girl.length();
        boy = boy.toLowerCase();
        girl = girl.toLowerCase();

//        loop area

//        outer loop
        for(int i =0;i<boy_ch;i++){
            for(int j=0; j<girl_ch; j++){
//                inner loop (main)
                if (boy.charAt(i) == girl.charAt(j)){
                    counter++;
                }
            }
        }
        int ans=girl_ch-counter;

        switch (ans) {
            case 0 -> System.out.println("Siblings Sweet Home Alabama");
            case 1 -> System.out.println("Enemies");
            case 2 -> System.out.println("Affectionate");
            case 3 -> System.out.println("Lovers");
            case 4 -> System.out.println("Marriage");
            default -> System.out.println("Friends");
        }
        }
    }

