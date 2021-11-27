package lesson5.Task2.ActionControllers;

import lesson5.Task2.Role;
import lesson5.Task2.Store;
import lesson5.Task2.User;
import lesson5.Task2.Exceptions.UserNotFoundException;

public class DirectorActionController implements ActionController {
    private Store store;
    private Role role;

    public Role getRole() {
        return this.role;
    }

    public DirectorActionController(Store store) {
        this.role = Role.DIRECTOR;
        this.store = store;
    }

    public String getUserInformationByEmail(String email) throws UserNotFoundException {
        User user = store.getUser(email);
        if (user != null) {
            return user.toString();
        }
        throw new UserNotFoundException(email);
    }

    public void changeSalaryByEmail(String email, int salary) throws UserNotFoundException {
        User user = store.getUser(email);
        if (user != null) {
            user.setSalary(salary);
            System.out.println("salary changed. New salary = " + user.getSalary());
            return;
        }
        throw new UserNotFoundException(email);
    }
}