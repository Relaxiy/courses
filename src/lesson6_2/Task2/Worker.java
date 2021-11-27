package lesson6_2.Task2;

public class Worker extends Employee {
    private EmployeeType employeeType;

    Worker(String name, String lastName, int age) {
        super(name, lastName, age);
        this.employeeType = EmployeeType.WORKER;
    }
}