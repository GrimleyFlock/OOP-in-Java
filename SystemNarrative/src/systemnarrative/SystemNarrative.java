package systemnarrative;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemNarrative {
    
    static ArrayList<Icon> icons = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int selection;
        
        while (true){
            System.out.print("Hello. Please choose an action: \n");
            System.out.println("[1 = Add icon's name & achievment, 2 = View icon's information, 3 = Exit]");
            selection = scanner.nextInt();
            
            switch(selection){
                case 1:
                    addInfo();
                    break;
                case 2:
                    viewInfo();
                    break;
                case 3:
                    exitApp();
                    break;
                default:
                    System.out.println("Wrong selection! Please try again.");
            }
        }
        
        
    }
    
    private static void addInfo(){
        System.out.println("Enter icon name: ");
        scanner.nextLine();
        String IconName = scanner.nextLine();
        
        System.out.println("Enter the icon's achievement: ");
        String Achievement = scanner.nextLine();
        scanner.nextLine();
        
        Icon icon = new Icon();
        icon.IconName = IconName;
        icon.Achievement = Achievement;
        
        icons.add(icon);//Adds data to the array list icons
        System.out.println("The information has been added successfully!");
        System.out.println(); 
    }
    
    private static void viewInfo(){
        System.out.println("_______________________________________________________________");
        System.out.println("Here is the list of icons & their achievements:                ");
        System.out.println();
        
        for (int i = 0; i < icons.size(); i++){
            Icon icon = icons.get(i);
            icon.displayContent();
        }
        System.out.println("_______________________________________________________________");
        System.out.println();
        
    }
    
    private static void exitApp(){
        System.exit(0);
    } 
}
