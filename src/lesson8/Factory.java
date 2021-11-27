package lesson8;

public class Factory {
    private Car[] cars;

    public Factory() {
        cars = new Car[6];
        this.cars[0] = new PassengerCar(5, 320, "Mersedes", 20000, TypeCar.BUSINESS);
        this.cars[1] = new PassengerCar(5, 240, "Hunday", 7500, TypeCar.SIMPLE);
        this.cars[2] = new PassengerCar(7, 300, "Caddilac", 40000, TypeCar.LUXURY);
        this.cars[3] = new PassengerCar(2, 700, "McLarren", 220000, TypeCar.LUXURY);
        this.cars[4] = new CargoCar("Maz", 1000, 1500, 55000);
        this.cars[5] = new CargoCar("Maz", 800, 1000, 40000);
    }

    public Car searchCar(int price) throws CarNotFoundException {
        for(int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getPrice() == price) {
                return cars[i];
            }
        }
        throw new CarNotFoundException(price);
    }

    public void signal() {
        for(int i = 0; i < this.cars.length; i++) {
            this.cars[i].signaling();
        }
    }
}