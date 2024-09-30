/**
 * 
 */
public class Engine {

    //set attributes
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Creates object of class Engine
     * @param type The engine's fuel type (FuelType.STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER)
     * @param current The fuel the engine has to begin
     * @param max The max amount of fuel the engine can hold
     */
    public Engine (FuelType type, double current, double max) {
        this.fuelType = type;
        this.currentFuelLevel = current;
        this.maxFuelLevel = max;
    }

    //methods
    /**
     * 
     */
    public void refuel(){
        this.currentFuelLevel = maxFuelLevel;
    }

    //accessor methods


    /**
     * 
     * @return
     */
    public FuelType getFuelType (){
        return this.fuelType;
    }

    /**
     * 
     * @return
     */
    public double getCurrentFuelLevel(){
        return this.currentFuelLevel;
    }

    /**
     * 
     * @return
     */
    public double getMaxFuelLevel (){
        return this.maxFuelLevel;
    }

    /**
     * 
     * @return
     */
    public Boolean go(){
        this.currentFuelLevel -= 5;
        System.out.println("Fuel remaining: " + currentFuelLevel);
        if (currentFuelLevel > 0){
            return true;
        }
        else{
            return false; 
        }
    }

    /**
     * 
     * @param args
     */
    public String toString(){
        return "Current fuel level: " + Double.toString(currentFuelLevel);
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 200.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        myEngine.refuel();
        System.out.println(myEngine.toString());
    }




}