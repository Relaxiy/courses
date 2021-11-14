package lesson4.Task6;

public class Lector extends Person {
    private int workingYears;

    public int getWorkingYears() {
        return workingYears;
    }


    public Lector(String firstName, String lastName, int age, int workingYears) {
        super(firstName, lastName, age);
        this.workingYears = workingYears;
    }

}
