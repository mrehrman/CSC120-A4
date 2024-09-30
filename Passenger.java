public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    //methods
    public String getName(){
        return this.name;
    }

    public void boardCar(Car c){
        if (c.addPassenger(this) == true){
            c.addPassenger(this);
            System.out.println(this.name + " boarded the car.");
        }
    }

    public void getOffCar(Car c){
        if (c.removePassenger(this) == true){
            c.removePassenger(this);
            System.out.println(this.name + " left the car.");
        }
    }
}
