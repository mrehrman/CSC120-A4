import java.util.ArrayList;

/**
 * Initializes the class Train. Trains have Engines and Cars. Its Cars hold Passengers.
 */
public class Train {

    //attributes
    private Engine engine;
    private ArrayList<Car> cars;
    private int numOfCars;
    private int passengerCapacity;

    //constructor
    /**
     * Creates instance of class Train.
     * @param fuelType A fuelType used to intiialize the Train's Engine.
     * @param fuelCapacity A fuelCapacity used to intiialize the Train's current and max fuel levels.
     * @param nCars The number of Cars the Train has.
     * @param passengerCapacity The number of Passengers each Car can hold.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.numOfCars = nCars;
        this.passengerCapacity = passengerCapacity;
        this.cars = new ArrayList<>(nCars);
        for (int i = 1; i <= nCars; i++){
            Car c = new Car(passengerCapacity);
            cars.add(c);
        }
    }

    //methods
    /**
     * Accessor for Train's Engine.
     * @return The Train's Engine.
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Accessor for one of a Train's Cars.
     * @param i The index at which the Car is.
     * @return The Train's Car at index i.
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /**
     * Determines a Train's maximum capacity by multiplying the number of Cars by each Car's capacity.
     * @return The Train's maximum capacity.
     */
    public int getMaxCapacity(){
        return (this.numOfCars * this.passengerCapacity);
    }

    /**
     * Determines the number of spaces for Passengers remaining on the Train.
     * @return The number of seats remaining for Passengers.
     */
    public int seatsRemaining(){
        int seats = 0;
        for (int i = 0; i < numOfCars; i++){
            int seatsPerCar = cars.get(i).seatsRemaining();
            seats += seatsPerCar;
        }
        return seats;
    }

    /**
     * Prints a list of the names of all the Passengers on the Train.
     */
    public void printManifest(){
        for (int i = 0; i < numOfCars; i++){
            cars.get(i).printManifest();
        }
    }

    /**
     * The main method runs elements of the Train class.
     * @param args
     */
    public static void main(String[] args) {
        Passenger person1 = new Passenger("Maddie");
        Passenger person2 = new Passenger("Amelia");
        Passenger person3 = new Passenger("Leah");
        Passenger person4 = new Passenger("Ben");

        Train t = new Train(FuelType.STEAM, 100, 5, 25);
        System.out.println(t.cars);
        Car car2 = t.getCar(2);
        car2.addPassenger(person1);
        System.out.println(t.seatsRemaining());
        t.printManifest();
    }
}
