package Assignment2.DataCoupling;



public class Rent {
    int rentPrice;
    int calculateRent(Flat flat)
    {
        if(flat.furnished)
        {
           rentPrice= flat.numberOfRooms*10000 + flat.bathrooms*500;
        }
        else {
            rentPrice = flat.numberOfRooms * 5000 + flat.bathrooms * 500;
        }
        return rentPrice;
    }
}

/** Rent uses the data attributes of Flat class in its function to calculateRent which is an example of Data Coupling  **/
