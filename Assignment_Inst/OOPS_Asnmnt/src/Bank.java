import com.sun.source.tree.CaseTree;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    private String accountHolderName;
    private long accountNumber;
    private String accountType;
    private double accountBalance;

    Bank() {
        accountHolderName = "NA";
        accountNumber = 0;
        accountType = "NA";
        accountBalance = 0;
    }

    void CreateAccount(String accountHolderName, long accountNumber, String accountType, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        System.out.println("--> Account Created Successfully...\n");
    }

    void Display() {
        System.out.println("-----------Account Details-----------");
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account Balance : " + accountBalance+"\n");
    }

    void Deposit(double amonut) {

        accountBalance+=amonut;
        System.out.println("Money Deposited Successfully...\n");

    }

    void Withdraw(double amonut) {
        System.out.println("Before With-drawling : " + accountBalance);
        accountBalance-=amonut;
        System.out.println("Money Withdrawal Successfully...");
        System.out.println("Current Balance : " + accountBalance+"\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank a1 = new Bank();
        a1.CreateAccount("Monu Kumar",39499326414l,"Saving",24000.72);
//        a1.Display();
//        a1.Deposit(11400);
//        a1.Withdraw(4000);
        int choice;
        char exit ='y';
        do {
            System.out.println("-----------Lunch Bank of India-----------");
            System.out.println("|                                       |");
            System.out.println("|       1. See Account Details          |");
            System.out.println("|       2. Deposit Money                |");
            System.out.println("|       3. Withdraw Money               |");
            System.out.println("|                                       |");
            System.out.println("-----------------------------------------");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            System.out.println("");

            switch (choice) {
                case 1 -> {
                    a1.Display();
                }
                case 2 -> {
                    System.out.println("--------Deposit Money--------");
                    System.out.print("Enter The Amount : ");
                    double Amount = sc.nextDouble();
                    a1.Deposit(Amount);
                }
                case 3 -> {
                    System.out.println("--------Withdrawal Money--------");
                    System.out.print("Enter The Amount : ");
                    double Amount = sc.nextDouble();
                    a1.Withdraw(Amount);
                }
                default -> {
                    System.out.println("-> Enter the Valid Input...");
                }


            }
            System.out.print("Do you want to continue (y|n) : ");
            exit = sc.next().trim().charAt(0);
            System.out.println("");
        } while (exit == 'y' || exit =='Y');
    }

}












