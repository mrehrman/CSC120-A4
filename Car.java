import java.util.ArrayList;

/**
 * Initializes the class Car. A Car holds Passengers.
 */
public class Car {

    //set attributes
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    //constructor
    /**
     * Creates instance of class Car.
     * @param maxCapacity The max number of Passengers a Car can hold.
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>(maxCapacity);
    }

    //methods
    /**
     * Accessor for a Car's maxCapacity.
     * @return The Car's maxCapacity.
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * Determines how many more Passengers a Car can hold.
     * @return The remaining number of seats in the Car.
     */
    public int seatsRemaining(){
       int currentPassengers = passengers.size();
       int seats = maxCapacity - currentPassengers;
       return seats;
    }

    /**
     * Adds a Passenger to a Car if there are seats in the Car.
     * @param p The Passenger to add to the car.
     * @return True if there are seats remaining in the Car, False if there are no seats remaining.
     */
    public Boolean addPassenger(Passenger p){
        if (this.seatsRemaining() > 0){
            this.passengers.add(p);
            return true;
        }
        else {
            System.out.println("There are no seats remaining.");
            return false;
        }
    }

    /**
     * Removes a Passenger from a Car if they are in the Car.
     * @param p The Passenger to remove from the car.
     * @return True if the Passenger was in the Car and has been removed, false if the Passenger was not in the Car.
     */
    public Boolean removePassenger(Passenger p){
        if (this.passengers.contains(p)){
            this.passengers.remove(p);
            return true;
        }
        else{
            System.out.println(p.getName() + " is not on the train.");
            return false;
        }
    }

    /**
     * Prints a list of the names of the Passengers in a Car. 
     */
    public void printManifest(){
        if (passengers.size() > 0){
            for (int i = 0; i < passengers.size(); i++){
                Passenger p = passengers.get(i); 
                System.out.println(p.getName());
            }
        }
        else{
            System.out.println("This car is EMPTY.");
        }
    }

    /**
     * The main method runs elements of the Car class.
     * @param args
     */
    public static void main(String[] args) {
        Car myCar = new Car(2);
        Passenger person1 = new Passenger("Maddie");
        Passenger person2 = new Passenger("Amelia");
        Passenger person3 = new Passenger("Leah");
        Passenger person4 = new Passenger("Ben");
        System.out.println(myCar.getCapacity());
        myCar.addPassenger(person1);
        myCar.addPassenger(person2);
        System.out.println(myCar.seatsRemaining());
        myCar.removePassenger(person4);
        myCar.addPassenger(person4);
        myCar.removePassenger(person1);
        System.out.println(myCar.seatsRemaining());
        person3.boardCar(myCar);
        person4.boardCar(myCar);
        person3.getOffCar(myCar);
        person4.getOffCar(myCar);
        myCar.addPassenger(person4);
        myCar.printManifest();
    } 


}