package lesson6_2.Task2;

public enum EmployeeType {
    DIRECTOR("��������"),
    WORKER("�������");

    private String string;

    private EmployeeType(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
}