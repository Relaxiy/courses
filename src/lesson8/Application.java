package lesson8;

public class Application {
    public static void main(String[] args) {
        Factory factory = new Factory();
        try {
            factory.signal();
            factory.searchCar(10000);
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}