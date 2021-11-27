package lesson6_2.Task2;

public class Director extends Employee {
    private EmployeeType employeeType;

    Director(String name, String lastName, int age) {
        super(name, lastName, age);
        this.employeeType = EmployeeType.DIRECTOR;
    }
}