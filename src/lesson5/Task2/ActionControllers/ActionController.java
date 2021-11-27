package lesson5.Task2.ActionControllers;

import lesson5.Task2.Role;
import lesson5.Task2.Exceptions.UserNotFoundException;

public interface ActionController {
    String getUserInformationByEmail(String email) throws UserNotFoundException;
    void changeSalaryByEmail(String email, int salary) throws UserNotFoundException;
    Role getRole();
}