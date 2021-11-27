
package lesson5.Task2.ActionControllers;

import lesson5.Task2.Role;
import lesson5.Task2.Store;
import lesson5.Task2.User;
import lesson5.Task2.Exceptions.UserNotFoundException;

public class HRActionController implements ActionController {
    private Store store;
    private Role role;

    public HRActionController(Store store) {
        this.role = Role.HR;
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
        if (user != null && user.getRole().equals("Рядовой сотрудник")) {
            user.setSalary(salary);
            System.out.println("salary changed. New salary = " + user.getSalary());
            return;
        }
        if (user != null && (user.getRole().equals("Директор") || user.getRole().equals("Менеджер отдела кадров"))) {
            System.out.println("Недостаточно прав");
            return;
        }
        throw new UserNotFoundException(email);
    }

    public Role getRole() {
        return this.role;
    }
}
