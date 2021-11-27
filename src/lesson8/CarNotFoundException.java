package lesson8;

public class CarNotFoundException extends Exception {
    public CarNotFoundException(int price) {
        super("Car with this price " + price + " not found");
    }
}
