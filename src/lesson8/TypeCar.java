package lesson8;

public enum TypeCar {
    LUXURY("Люкс"),
    BUSINESS("Бизнес"),
    SIMPLE("Стандарт");

    private String string;

    private TypeCar(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
}