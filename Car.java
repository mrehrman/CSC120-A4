import java.util.ArrayList;

public class Car {

    //set attributes
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    //constructor
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>(maxCapacity);
    }

    //methods
    public int getCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
       int currentPassengers = passengers.size();
       int seats = maxCapacity - currentPassengers;
       return seats;
    }

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

    public void printManifest(){
        if (passengers.size() > 0){
            System.out.println("Passengers:");
            for (int i = 0; i < passengers.size(); i++){
                Passenger p = passengers.get(i); 
                System.out.println(p.getName());
            }
        }
        else{
            System.out.println("This car is EMPTY.");
        }
    }


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