package lesson5.Task2.ActionControllers;

import lesson5.Task2.Role;
import lesson5.Task2.Store;
import lesson5.Task2.User;
import lesson5.Task2.Exceptions.UserNotFoundException;

public class EmployeeActionController implements ActionController {
    private Store store;
    private Role role;

    public EmployeeActionController(Store store) {
        this.role = Role.EMPLOYEE;
        this.store = store;
    }

    public String getUserInformationByEmail(String email) throws UserNotFoundException {
        User user = store.getUser(email);
        if (user != null && user.getRole().equals("������� ���������")) {
            return user.toString();
        }
        if (user != null || !user.getRole().equals("��������") && !user.getRole().equals("�������� ������ ������")) {
            return "������������ ����";
        }
        throw new UserNotFoundException(email);
    }

    public void changeSalaryByEmail(String email, int salary) throws UserNotFoundException {
        System.out.println("������������ ����");
    }

    public Role getRole() {
        return this.role;
    }
}