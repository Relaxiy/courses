
package lesson5.Task1;

public class Money {
    private int days;

    public Money(int days) {
        this.days = days;
    }

    public void result() {
        EmployeeType[] employeeTypes = new EmployeeType[]{EmployeeType.DIRECTOR, EmployeeType.ENGINEER, EmployeeType.DEPARTMENT_HEAD, EmployeeType.TRAINEE};
        for(int i = 0; i < employeeTypes.length; i++) {
            System.out.println(employeeTypes[i].getSalary() * this.days);
        }
    }

    public static void main(String[] args) {
        Money money = new Money(22);
        money.result();
    }
}