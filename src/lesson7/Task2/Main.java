package lesson7.Task2;

import lesson7.Task2.Exceptions.ArrayFillingException;
import lesson7.Task2.Exceptions.UserNotFoundException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Store store = new Store(6);
        User[] users = new User[]{new User("G", "12345678"),
                new User("H", "44444444"),
                new User("K", "33333333"),
                new User("L", "55555555"),
                new User("M", "11111111"),
                new User("N", "88888888"),
                new User("D", "99999999")
        };

        try {
        for(int i = 0; i < users.length; ++i) {
                store.addUser(users[i]);
            }
        } catch (ArrayFillingException e) {
            System.out.println(e.getMessage());
        }

        try {
            store.getUser("G", "44443233");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}