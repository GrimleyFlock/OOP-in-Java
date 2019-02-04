package fruit.application;

/**
 *
 * @author njugu
 */
public class FruitApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The FruitApplication has just started ...");
        Fruit fruit1 = new Fruit();
            fruit1.name = "Banana";
            fruit1.color = "yellow";
            fruit1.weight = 0.22f;
            
        Fruit fruit2 = new Fruit();
            fruit2.name = "Plum";
            fruit2.color = "red";
            fruit2.weight = 0.08f;
          
        Fruit fruit3 = new Fruit();
            fruit3.name = "Grape";
            fruit3.color = "purple";
            fruit3.weight = 0.05f;
            
            
            fruit1.printFruitColorOne();
            fruit2.printFruitColorTwo();
            fruit3.printFruitColorOne();
            
        System.out.println("The FruitApplication is now about to exit ...");
            
        // TODO code application logic here
    }
    
}
