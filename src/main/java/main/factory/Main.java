package main.factory;

import java.util.HashSet;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car fiat = new Car("Fiat Punto", 2010, "Black", 45);
        
//        fiat.setModel("Fiat Punto");
//        fiat.setBuildYear (2010);
//        fiat.setColor ("black");
//        fiat.setConsumption (6);
//        fiat.setCurrentFuel (20);
//        fiat.setMaxFuel (45);
        
        fiat.showData();
        
        
        
        
        Car ford = new Car("Ford", 2015, "Red", 40, 10, 15, 80, 65);
        ford.showData();
        
        
        
        Car volkswagen = new Car("Volkswagen Passat", 2014, "Grey", 85, 6, 20, 100, 87);
        volkswagen.showData();
        volkswagen.travel(20);
        volkswagen.showData();
        volkswagen.travel(500);
        volkswagen.showData();
        volkswagen.fuelUp(20);
        volkswagen.showData();
        volkswagen.getIn(8);
        volkswagen.showData();
        
        
    }
    
}
