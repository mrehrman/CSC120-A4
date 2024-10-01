/**
 * Initializes the class Passenger. Passengers get on and off of Cars.
 */
public class Passenger {
    
    private String name;

    /**
     * Creates an instance of class Passenger.
     * @param name The Passenger's name.
     */
    public Passenger(String name) {
        this.name = name;
    }

    //methods
    /**
     * Accessor for a Passenger's name.
     * @return The Passenger's name.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Allows a Passenger to board a Car.
     * @param c The Car for the Passenger to be added to.
     */
    public void boardCar(Car c){
        if (c.addPassenger(this) == true){
            c.addPassenger(this);
            System.out.println(this.name + " boarded the car.");
        }
    }

    /**
     * Allows a Passenger to get off a Car.
     * @param c The car for the Passenger to get off.
     */
    public void getOffCar(Car c){
        if (c.removePassenger(this) == true){
            c.removePassenger(this);
            System.out.println(this.name + " left the car.");
        }
    }
}
