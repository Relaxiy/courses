package lesson5.Task2;

import lesson5.Task2.ActionControllers.ActionController;
import lesson5.Task2.ActionControllers.DirectorActionController;
import lesson5.Task2.ActionControllers.EmployeeActionController;
import lesson5.Task2.ActionControllers.HRActionController;
import lesson5.Task2.Exceptions.ControllerNotFoundException;

public class ActionControllerHandler {
    private Store store;
    private ActionController[] actionControllers;

    public ActionController getActionController(Role role) throws ControllerNotFoundException {
        for(int i = 0; i < actionControllers.length; i++) {
            if (actionControllers[i].getRole().equals(role)) {
                return actionControllers[i];
            }
        }
        throw new ControllerNotFoundException();
    }

    public ActionControllerHandler() {
        store = new InmemoryStore();
        this.actionControllers = new ActionController[]{
                new DirectorActionController(this.store),
                new EmployeeActionController(this.store),
                new HRActionController(this.store)
        };
    }
}