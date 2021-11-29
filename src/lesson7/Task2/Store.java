package lesson7.Task2;

import lesson7.Task2.Exceptions.ArrayFillingException;
import lesson7.Task2.Exceptions.UserNotFoundException;

public class Store {
    private User[] users;

    Store(int length) {
        this.users = new User[length];
    }

    public User getUser(String login, String password) throws UserNotFoundException {
        for(int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        throw new UserNotFoundException();
    }

    public void addUser(User user) throws ArrayFillingException {
        for(int i = 0; i < users.length; ++i) {
            if (users[i] == null) {
                users[i] = user;
                return;
            }
        }
        throw new ArrayFillingException();
    }
}