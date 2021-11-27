package lesson5.Task2;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private int salary;

    public User(String firstName, String lastName, String email, Role role, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getRole() {
        return this.role.getRole();
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "User{firstName='" + this.firstName + "', lastName='" + this.lastName + "', role=" + this.role.getRole() + ", salary=" + this.salary + "}";
    }
}