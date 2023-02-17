import java.util.Scanner;

//14.Write a Java program to check whether an alphabet is a vowel or consonant.
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char con = input.next().charAt(0);
        if((con=='a'|| con=='e' || con=='i' || con=='o' || con=='u') || (con=='A'|| con=='E' || con=='I' || con=='O' || con=='U')){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
