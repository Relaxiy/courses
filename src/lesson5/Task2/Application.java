
package lesson5.Task2;

import lesson5.Task2.ActionControllers.ActionController;
import lesson5.Task2.Exceptions.ControllerNotFoundException;
import lesson5.Task2.Exceptions.UserNotFoundException;

public class Application {
    public static void main(String[] args) {
        try {
            ActionController[] actionControllers = new ActionController[3];
            ActionControllerHandler actionControllerHandler = new ActionControllerHandler();

            actionControllers[0] = actionControllerHandler.getActionController(Role.DIRECTOR);
            System.out.println(actionControllers[0].getUserInformationByEmail("4@gmail.com"));
            actionControllers[0].changeSalaryByEmail("1@gmail.com", 100);

            actionControllers[1] = actionControllerHandler.getActionController(Role.HR);
            System.out.println(actionControllers[1].getUserInformationByEmail("1@gmail.com"));
            actionControllers[1].changeSalaryByEmail("2@gmail.com", 100);

            actionControllers[2] = actionControllerHandler.getActionController(Role.EMPLOYEE);
            System.out.println(actionControllers[2].getUserInformationByEmail("5@gmail.com"));
            actionControllers[2].changeSalaryByEmail("5@gmail.com", 100);
        } catch (UserNotFoundException | ControllerNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}