package Assignment2.Indipendence;

public class Car {
    int wheels;
    int windows;
    int numberOfSeats;
    String model;
    public Car(String model,int wheels,int windows,int numberOfSeats)
    {
        this.model=model;
        this.wheels=wheels;
        this.windows=windows;
        this.numberOfSeats=numberOfSeats;
    }
}

/** Car and Bike class are not related or dependent on each other which is an example of indipendence**/
