package lesson8;

public class CarNotFoundException extends Exception {
    public CarNotFoundException(int price) {
        super("Машины с такой ценой " + price + " не существует");
    }
}
