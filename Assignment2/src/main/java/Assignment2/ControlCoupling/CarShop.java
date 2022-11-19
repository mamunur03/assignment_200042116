package Assignment2.ControlCoupling;

public class CarShop {
    public void CarOrder(Car car,String order)
    {
        if(order=="Buy")
        {
            car.CarSell();
        }
        else if (order=="Loan") {

            car.CarLoan();

    }
    }

}

/** CarShop controls the flow of execution of function of Car object which is an example of ControlCoupling **/
