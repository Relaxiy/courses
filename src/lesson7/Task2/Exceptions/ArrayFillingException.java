package lesson7.Task2.Exceptions;

public class ArrayFillingException extends Exception {
    public ArrayFillingException() {
        super("Error! The user array is full!");
    }
}