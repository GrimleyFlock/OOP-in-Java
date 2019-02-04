package inputapplication;

import java.util.Scanner;

public class InputApplication {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full names: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter yout nickname: ");
        String nickname = scanner.next();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); if (scanner.hasNext()){
            scanner.nextInt();
        }
        
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
        
        System.out.println("=================================");
        
        System.out.println("Full name: " + fullName);
        System.out.println("Nickname: " + nickname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        
        
        
     
    }
    
}
