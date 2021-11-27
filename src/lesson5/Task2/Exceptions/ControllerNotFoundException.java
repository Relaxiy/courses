package lesson5.Task2.Exceptions;

public class ControllerNotFoundException extends Exception {
    public ControllerNotFoundException() {
        super("Такого пакета прав не существует");
    }
}