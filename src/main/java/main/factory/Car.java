package main.factory;

/**
 *
 * @author qa
 */
public class Car {
    
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int minFuel;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    
    
    public Car () {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
    }
    
    public Car (String customModel, int customBuildYear, String customColor, int customMaxFuel) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
    }
    
    public Car (String customModel, int customBuildYear, String customColor, int customMaxFuel, int customConsumption, int customCurrentFuel) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentFuel = customCurrentFuel;
    }
    
    
    public String getModel () {
        return this.model;
    }
    
    public void setModel (String customModel) {
        this.model = customModel;
    }
    
    public int getBuildYear () {
        return this.buildYear;
    }
    
    public void setBuildYear (int customBuildYear) {
        this.buildYear = customBuildYear;
    }
    
    public String getColor () {
        return this.color;
    }
    
    public void setColor (String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel () {
        return this.maxFuel;
    }
    
    public void setMaxFuel (int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
    public int getCurrentFuel () {
        return this.currentFuel;
    }
    
    public void setCurrentFuel (int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption () {
        return this.consumption;
    }
    
    public void setConsumption (int customConsumption) {
        this.consumption = customConsumption;
    }
    
    public String getVehicleType () {
        return this.vehicleType;
    }
    
    
    public void showData () {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara: " + this.getMaxFuel());
        System.out.println();
    }
        
    public void travel(int distanceTraveled) {

//        1. definisati novi atribut 'mileage'
//        2. napraviti get i set metode
//        3. prosiriti jedan od konstruktora da moze da se setuje i mileage
//        4. kolicina goriva da se smanji za kolicinu potrosenog
//        5. kilometraza da se uveca

//        novi atribut za stanje motora, da li je automobil ukljucen ili ne
    }

    
}
