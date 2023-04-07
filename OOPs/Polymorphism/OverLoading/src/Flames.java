import java.util.Scanner;
import java.util.SimpleTimeZone;

// Write a program of flames
public class Flames {
    static String play(String girl, String boy) {
        int boy_ch,girl_ch,counter=0;
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
            case 0 -> {
                return "Siblings Sweet Home Alabama";
            }
            case 1 -> {
                return "Enemies";
            }
            case 2 -> {
                return "Affectionate";
            }
            case 3 -> {
                return "Lovers";
            }
            case 4 -> {
                return "Marriage";
            }
            default -> {
                return "Friends";
            }
        }

    }
    public static void main(String[] args) {
        System.out.println(play("Juliet","Romeo"));
        }
    }

