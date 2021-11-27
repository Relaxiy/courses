package lesson7.Task2.Exceptions;

public class ArrayFillingException extends Exception {
    public ArrayFillingException() {
        super("Ошибка! Массив пользователей заполнен!");
    }
}