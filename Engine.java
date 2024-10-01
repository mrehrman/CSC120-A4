/**
 * An Engine has attributes fuelType, currentFuelLevel, and maxFuelLevel.
 * it can "go," causing currentFuelLevel to go down.
 */
public class Engine {

    //set attributes
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Creates instance of class Engine.
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
     * Resets the Engine's currentFuelLevel to its maxFuelLevel.
     */
    public void refuel(){
        this.currentFuelLevel = maxFuelLevel;
    }

    //accessor methods


    /**
     * Accessor for the Engine's fuelType.
     * @return The Engine's fuel type: STEAM, INTERNAL_COMBUSTION, ELECTRIC, or OTHER.
     */
    public FuelType getFuelType (){
        return this.fuelType;
    }

    /**
     * Accessor for the Engine's currentFuelLevel.
     * @return The Engine's currentFuelLevel.
     */
    public double getCurrentFuelLevel(){
        return this.currentFuelLevel;
    }

    /**
     * Accessor for the Engine's maxFuelLevel.
     * @return The Engine's maxFuelLevel.
     */
    public double getMaxFuelLevel (){
        return this.maxFuelLevel;
    }

    /**
     * Allows the Engine to "go" while it has fuel remaining. The fuel level goes down as the Engine goes.
     * @return True if the Engine still has fuel, false if the Engine is out of fuel.
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
     * Creates a string to display the Engine's currentFuelLevel.
     * @return The formatted string with currentFuelLevel.
     */
    public String toString(){
        return "Current fuel level: " + Double.toString(currentFuelLevel);
    }

    /**
     * The main method runs elements of the Engine class.
     * @param args
     */
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