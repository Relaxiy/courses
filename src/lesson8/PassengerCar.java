package lesson8;

public class PassengerCar implements Car {
    private int countPassenger;
    private int powerEngine;
    private String brand;
    private int price;
    private TypeCar typeCar;

    public PassengerCar(int countPassenger, int powerEngine, String brand, int price, TypeCar typeCar) {
        this.countPassenger = countPassenger;
        this.powerEngine = powerEngine;
        this.brand = brand;
        this.price = price;
        this.typeCar = typeCar;
    }

    public String toString() {
        return "PassengerCar{countPassenger=" + this.countPassenger + ", powerEngine=" + this.powerEngine + ", brand='" + this.brand + "', price=" + this.price + ", typeCar=" + this.typeCar + "}";
    }

    public void signaling() {
        System.out.println("Passenger car created");
    }

    public int getPrice() {
        return this.price;
    }
}