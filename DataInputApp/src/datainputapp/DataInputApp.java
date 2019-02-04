
package datainputapp;

import java.util.ArrayList;
import java.util.Scanner;

public class DataInputApp {
    
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int operation;
        
        while(true){
            System.out.print("Select an operation: ");
            System.out.println("[0 = Exit, 1 = Add, 2 = View]");
            operation = scanner.nextInt();
            
            switch(operation){
                case 0:
                    exitApplication();
                    break;
                case 1:
                    addRecord();
                    break;
                case 2:
                    viewRecords();
                    break;
            }
        }
        
    }
    
    private static void exitApplication(){
        System.exit(0);
    }
    
    private static void addRecord(){
        System.out.println("Enter Student name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
       
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();
        
        Student student = new Student();
        student.name = name;
        student.age = age;
        
        students.add(student);//Add data to array list
        System.out.println("Records added successfully!");
        System.out.println();
    }
    
    private static void viewRecords(){
        System.out.println("*********************************");
        System.out.println("STUDENT LIST");
        System.out.println("*********************************");
        for (int i = 0; i < students.size(); i++){
        Student student = students.get(i);
        student.printMessage();
    }
        System.out.println("*********************************");
        System.out.println();
    }
}
