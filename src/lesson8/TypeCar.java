package lesson8;

public enum TypeCar {
    LUXURY("����"),
    BUSINESS("������"),
    SIMPLE("��������");

    private String string;

    private TypeCar(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
}