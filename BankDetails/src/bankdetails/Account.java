package bankdetails;

import java.sql.Timestamp;

public class Account {
    String name;
    String address;
    double balance;
    
    void displayInfo(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("*****************************************");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account balance: KES " + balance);
        System.out.println("Time requested: " + timestamp);
    }
}
