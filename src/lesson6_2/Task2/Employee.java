package lesson6_2.Task2;

public abstract class Employee {
    private String name;
    private String lastName;
    private int age;
    private EmployeeType employeeType;

    Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return this.name + " " + this.lastName + " " + this.age;
    }
}