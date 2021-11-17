package lesson4.Task6;

public class University {
    private Person[] person;

    public static void showName(Person[] person, int i){
        System.out.println(person[i].getFirstName());
    }

    public University(){
        this.person = new Person[10];
        this.person[0] = new Student("A", "A", 21);
        this.person[1] = new Student("B", "B", 19);
        this.person[2] = new Lector("C", "C", 54, 24);
        this.person[3] = new Lector("D", "D", 53, 28);
        this.person[4] = new Lector("E", "E", 36, 12);
        this.person[5] = new Student("F", "F", 20);
        this.person[6] = new Lector("G", "G", 34, 10);
        this.person[7] = new Student("H", "H", 18);
        this.person[8] = new Student("I", "I", 21);
        this.person[9] = new Lector("J", "J", 64, 22);

    }

    public static void oldestMan(Person[] person){
        if (person[0] != null) {
            int index = 0;
            int max = person[0].getAge();
            for (int i = 0; i < person.length; i++) {
                if (max < person[i].getAge()) {
                    index = i;
                    max = person[i].getAge();
                }
            }
            System.out.println(person[index]);
        }
    }

    public static Person[] returnStudents(Person[] person){
        Person[] students = new Person[person.length];
        int index = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Student) {
                students[index] = (Student)person[i];
                index++;
            }
        }
        return students;
    }

    public static Person worksLonger(Person[] person){
        Lector[] lectors = new Lector[person.length];
        int index = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Lector) {
                lectors[index] = (Lector)person[i];
                index++;
            }
        }
        Lector max = lectors[0];
        for (int i = 0; i < index; i++){
            if (max.getWorkingYears() < lectors[i].getWorkingYears()) {
                max = lectors[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        University university = new University();
        System.out.println("Person number 5:");
        showName(university.person, 4);

        System.out.println("The oldest person:");
        oldestMan(university.person);

        Person[] students = returnStudents(university.person);
        int i = 0;
        System.out.println("Students:");
        while(students[i] != null){
            System.out.println(students[i]);
            i++;
        }

        System.out.println("works the longest is " + worksLonger(university.person));
    }
}
