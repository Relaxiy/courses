package lesson5.Task2;

import lesson5.Task2.Exceptions.UserNotFoundException;

public interface Store {
    User getUser(String email) throws UserNotFoundException;
}