package lesson5.Task2.ActionControllers;

import lesson5.Task2.Role;
import lesson5.Task2.Exceptions.UserNotFoundException;

public interface ActionController {
    String getUserInformationByEmail(String var1) throws UserNotFoundException;
    void changeSalaryByEmail(String var1, int var2) throws UserNotFoundException;
    Role getRole();
}