package lesson4.Task6;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.age;
    }

    public static void showName(Person[] person, int i){
        System.out.println(person[i].firstName);
    }

    public static void oldestMan(Person[] person){
        int index = 0;
        int max = person[0].age;
        for (int i = 0; i < person.length; i++){
            if (max < person[i].age) {
                index = i;
                max = person[i].age;
            }
        }
        System.out.println(person[index]);
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
        Person[] lectors = new Lector[person.length];
        int index = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Lector) {
                lectors[index] = (Lector)person[i];
                index++;
            }
        }
        index = 0;
        int max = ((Lector)lectors[0]).getWorkingYears();
        int indexLector = 0;
        while (lectors[index] != null) {
            if (max < ((Lector) lectors[index]).getWorkingYears()) {
                max = ((Lector) lectors[index]).getWorkingYears();
                indexLector = index;
            }
            index++;
        }
        return lectors[indexLector];
    }

    public static void main(String[] args) {
        Person[] person = new Person[10];
        person[0] = new Student("A", "A", 21);
        person[1] = new Student("B", "B", 19);
        person[2] = new Lector("C", "C", 54, 24);
        person[3] = new Lector("D", "D", 53, 28);
        person[4] = new Lector("E", "E", 36, 12);
        person[5] = new Student("F", "F", 20);
        person[6] = new Lector("G", "G", 34, 10);
        person[7] = new Student("H", "H", 18);
        person[8] = new Student("I", "I", 21);
        person[9] = new Lector("J", "J", 64, 22);

        System.out.println("Person number 5:");
        showName(person, 4);

        System.out.println("The oldest person:");
        oldestMan(person);

        Person[] students = returnStudents(person);
        int i = 0;
        System.out.println("Students:");
        while(students[i] != null){
            System.out.println(students[i]);
            i++;
        }

        System.out.println("works the longest is " + worksLonger(person));
    }
}
