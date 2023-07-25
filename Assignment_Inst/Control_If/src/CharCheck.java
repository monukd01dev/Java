//13.Write a Java program to check whether a character is an alphabet, digit or special character.
import java.util.Scanner;
public class CharCheck {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char con = input.next().charAt(0); // if you have entered 112 don't worry it will take 1 only cause index is zero
        if ((con>='A' && con<='Z') || (con>='a' && con<='z')){
            System.out.println("Alphabet...");
        } else if (con>='0' && con<='9') {
            System.out.println("Number...");
        }else {
            System.out.println("Special Character...");
        }
    }
}
