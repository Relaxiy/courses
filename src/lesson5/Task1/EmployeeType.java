package lesson5.Task1;

public enum EmployeeType {
    DIRECTOR(100),
    ENGINEER(50),
    DEPARTMENT_HEAD(80),
    TRAINEE(60);

    private int salary;

    private EmployeeType(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }
}
