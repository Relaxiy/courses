package lesson8;

public class CargoCar implements Car {
    private String brand;
    private int powerEngine;
    private int maxCargoWeight;
    private int price;

    public void signaling() {
        System.out.println("Cargo car created");
    }

    public CargoCar(String brand, int powerEngine, int maxCargoWeight, int price) {
        this.brand = brand;
        this.powerEngine = powerEngine;
        this.maxCargoWeight = maxCargoWeight;
        this.price = price;
    }

    public String toString() {
        return "CargoCar{brand='" + this.brand + "', powerEngine=" + this.powerEngine + ", maxCargoWeight=" + this.maxCargoWeight + ", price=" + this.price + "}";
    }

    public int getPrice() {
        return this.price;
    }
}