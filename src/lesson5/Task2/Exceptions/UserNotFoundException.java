package lesson5.Task2.Exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String email) {
        super("������������ � ������ email " + email + " �� ����������");
    }
}