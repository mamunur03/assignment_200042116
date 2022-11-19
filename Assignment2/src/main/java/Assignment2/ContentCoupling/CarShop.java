package Assignment2.ContentCoupling;

public class CarShop {
    public void sellingPrice(Car car, int price)
    {
        car.price=price;
    }
}

/** CarShop sets the price of the Car object which is an example of ContentCoupling **/
