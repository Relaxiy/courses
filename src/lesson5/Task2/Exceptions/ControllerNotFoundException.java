package lesson5.Task2.Exceptions;

public class ControllerNotFoundException extends Exception {
    public ControllerNotFoundException() {
        super("There is no such package of rights");
    }
}