//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson5.Task2;

import lesson5.Task2.Exceptions.UserNotFoundException;

public class InmemoryStore implements Store {
    private User[] users;

    public User getUser(String email) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getEmail().equals(email)){
                return users[i];
            }
        }
        throw new UserNotFoundException(email);
    }

    public InmemoryStore() {
        this.users = new User[10];
        this.users[0] = new User("Alexey", "Novak", "1@gmail.com", Role.DIRECTOR, 200);
        this.users[1] = new User("Alina", "Kallaur", "2@gmail.com", Role.HR, 80);
        this.users[2] = new User("Eugeniy", "Panasenkov", "3@gmail.com", Role.HR, 80);
        this.users[3] = new User("Mikhail", "Guk", "4@gmail.com", Role.EMPLOYEE, 60);
        this.users[4] = new User("Egor", "Dubeshko", "5@gmail.com", Role.EMPLOYEE, 50);
        this.users[5] = new User("Dmitriy", "Levchuk", "6@gmail.com", Role.EMPLOYEE, 55);
        this.users[6] = new User("Danil", "Kosinskiy", "7@gmail.com", Role.EMPLOYEE, 65);
        this.users[7] = new User("Arseniy", "Shostailo", "8@gmail.com", Role.EMPLOYEE, 55);
        this.users[8] = new User("Pavel", "Pischulin", "9@gmail.com", Role.EMPLOYEE, 40);
        this.users[9] = new User("Pavel", "Golovey", "10@gmail.com", Role.EMPLOYEE, 45);
    }
}