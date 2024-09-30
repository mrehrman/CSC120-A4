import java.util.ArrayList;

public class Train {

    //attributes
    private Engine engine;
    private ArrayList<Car> cars;
    private int numOfCars;
    private int passengerCapacity;

    //constructor
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
    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return cars.get(i);
    }

    public int getMaxCapacity(){
        return (this.numOfCars * this.passengerCapacity);
    }

    public int seatsRemaining(){
        int seats = 0;
        for (int i = 1; i <= numOfCars; i++){
            Car car = this.cars.get(i);
            
        }
    }


    public static void main(String[] args) {
        Train t = new Train(FuelType.STEAM, 100, 5, 25);
        System.out.println(t.cars);
    }
}
