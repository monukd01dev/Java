//8.Write a program to find the eligibility of admission for a professional course based on the following criteria:
//
//        Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and Total in all three subject >=190 or Total in Maths and Physics >=140 ------------------------------------- Input the marks obtained in Physics :65 Input the marks obtained in Chemistry :51 Input the marks obtained in Mathematics :72 Total marks of Maths, Physics and Chemistry : 190 Total marks of Maths and Physics : 137 The candidate is not eligible.
import javax.xml.validation.Schema;
import java.util.Scanner;
public class AdmisnEligbCal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int math,phy,chem,totalM,mptotal;
        System.out.print("Marks in Math : ");
        math = input.nextInt();
        System.out.print("Marks in Physics : ");
        phy = input.nextInt();
        System.out.print("Marks in Chemistry : ");
        chem = input.nextInt();
        totalM = math+phy+chem;
        mptotal = totalM-chem;
        if((totalM>=190)&&(mptotal>=140)){
            System.out.println("You are eligible...");
        }else {
            System.out.println("You are uneligible...");
        }
    }
}
