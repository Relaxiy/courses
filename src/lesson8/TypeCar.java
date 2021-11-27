package lesson8;

public enum TypeCar {
    LUXURY("luxury"),
    BUSINESS("business"),
    SIMPLE("Standart");

    private String string;

    private TypeCar(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
}