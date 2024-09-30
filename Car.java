import java.util.ArrayList;

public class Car {

    //set attributes
    private ArrayList passengers;
    private int maxCapacity;

    //constructor
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<>(maxCapacity);
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
            System.out.println("That passenger is not on the train.");
            return false;
        }
    }

    public void printManifest(){
        if (passengers.size() > 0){
            for (int i = 0; i <= passengers.size(); i++){
                System.out.println(passengers.get(i));
            }
        }
        else{
            System.out.println("This car is EMPTY.");
        }
    }


    public static void main(String[] args) {
        Car myCar = new Car(10);
    }


}