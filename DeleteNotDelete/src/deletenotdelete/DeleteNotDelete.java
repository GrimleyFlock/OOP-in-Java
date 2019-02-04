package deletenotdelete;

import java.io.File;
import java.util.Scanner;

public class DeleteNotDelete {
    public static void main(String[] args) {
        File document = new File("Mangoes.txt");
        Scanner input = new Scanner(System.in);
        char reply;
        
        do {
            System.out.println("Delete document? (y/n) ");
            reply = input.findWithinHorizon(".", 0).charAt(0);
        } while (reply != 'y' && reply != 'n');
        
        if (reply == 'y'){
            System.out.println("Okay, here goes... ");
            document.delete();
            System.out.println("The document has been deleted. ");
        } else {
            System.out.println("Sorry buddy. Just asking.");
        }
         
    }
    
}
