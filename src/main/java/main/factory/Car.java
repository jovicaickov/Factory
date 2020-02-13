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
    private int currentMileage;
    private int distanceMileage;
    private int distanceTraveled;
    private int passengers;
    private int maxSeats;
    
    
    
    public Car () {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
        this.currentMileage = 0;
        this.passengers = 1;
        
    }
    
    public Car (String customModel, int customBuildYear, String customColor, int customMaxFuel) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
    }
    
    public Car (String customModel, int customBuildYear, String customColor, int customMaxFuel, int customConsumption, int customCurrentFuel, int customCurrentMileage, int customDistanceMileage) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentFuel = customCurrentFuel;
        this.currentMileage = customCurrentMileage;
        this.distanceMileage = customDistanceMileage;
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
    
    public int getCurrentMileage () {
        return this.currentMileage;
    }
    
    public void setCurrentMileage (int customCurrentMileage) {
        this.currentMileage = customCurrentMileage;
    }
    
    public int getDistanceMileage () {
        return this.distanceMileage;
    }
    
    public void setDistanceMileage (int customDistanceMileage) {
        this.distanceMileage = customDistanceMileage;
    }

    
    public void showData () {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara: " + this.getMaxFuel());
        System.out.println("Pocetna kilometraza: " + this.getCurrentMileage());
        System.out.println("Predjena kilometraza: " + this.getDistanceMileage());
        System.out.println("Zavrsna kilometraza: " + this.distanceTraveled);
        System.out.println();
    }
        
    public void travel(int distance) {
        if (this.getCurrentFuel() > (distance * this.getConsumption()) / 100)    {
            this.currentMileage = this.getCurrentMileage() + distance;
            this.currentFuel = this.getCurrentFuel() - (distance * this.getConsumption()) / 100;
            System.out.println("Uspesno ste presli: " + distance + "kilometara.");
        } else {
            System.out.println("Nema dovoljno goriva za put od: " + distance);
        }
    }
            
    public void fuelUp(int refill) {
        int emptySpace = this.getMaxFuel() - this.getCurrentFuel();
        
        if (refill < emptySpace)    {
            this.currentFuel = this.getCurrentFuel() + refill;
            System.out.println("Uspesno ste sipali: " + refill + ". Novo stanje je: " + this.getCurrentFuel());
        } else {
            this.currentFuel = this.getMaxFuel();
            System.out.println("Rezervoar je pun. Sipali ste: " + emptySpace);
        }
    }

    public void getIn () {
        int emptySeats = this.maxSeats - this.passengers;
        
        if (this.maxSeats >= this.passengers) {
            emptySeats = this.passengers + 1;
            System.out.println("Uslo je: " + emptySeats + " osoba.");
        } else {
            System.out.println("Automobil je pun.");
        }
    }
    
    public void getIn (int numberOfPeople) {
        int emptySeats = this.maxSeats - this.passengers;
        
        if (this.maxSeats >= this.passengers) {
            emptySeats = this.passengers + numberOfPeople;
            System.out.println("Uslo je: " + emptySeats + " osoba.");
        } else {
            System.out.println("Automobil je pun.");
        }
    }
    
    public void getOut () {
        
    }
    
    public void getOut (int numberOfPeople) {
        
    }
}

        

