package lesson8;

public class CarNotFoundException extends Exception {
    public CarNotFoundException(int price) {
        super("������ � ����� ����� " + price + " �� ����������");
    }
}
