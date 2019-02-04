package bankdetails;

import java.util.Scanner;


public class BankDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account account1 = new Account();//Defines a new object account1 under the class Account
        
        System.out.println("Enter your name please: ");
        String name = input.nextLine();
        
        System.out.println("Enter your address please: ");
        String address = input.nextLine();
        
        System.out.println("Enter your account balance: ");
        double balance = input.nextDouble();
        
        account1.name = name;
        account1.address = address;
        account1.balance = balance;
        
        account1.displayInfo();
         
        
    }
    
}
