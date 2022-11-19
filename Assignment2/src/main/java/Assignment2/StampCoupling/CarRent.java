package Assignment2.StampCoupling;
public class CarRent {
    int maxPassengers;

    public void setMaxPassengers(Car car) {
        this.maxPassengers = car.numberOfSeats;
    }
}

/** CarRent uses the attributes of the Car Class to set one of its attributes which is an example of Stamp Coupling **/
