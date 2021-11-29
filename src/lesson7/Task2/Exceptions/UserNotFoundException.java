package lesson7.Task2.Exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("User not found!");
    }
}