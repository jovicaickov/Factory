package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pocetak");
        
        String message = "Ovo je poruka";
        
        Car fiat = new Car();
        fiat.model = "Fiat Punto";
        fiat.buildYear = 2010;
        fiat.color = "black";
        fiat.consumption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        
        
        
        
    }
    
}
