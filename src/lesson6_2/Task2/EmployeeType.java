package lesson6_2.Task2;

public enum EmployeeType {
    DIRECTOR("Директор"),
    WORKER("Рабочий");

    private String string;

    private EmployeeType(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
}