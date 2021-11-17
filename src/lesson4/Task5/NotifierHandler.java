package lesson4.Task5;

public class NotifierHandler {
    private Notifier[] notifiers;

    public NotifierHandler(){
        notifiers = new Notifier[]{new EmailNotifier(), new MessengerNotifier(), new SMSNotifier()};
    }
    public static void addNotifier(Notifier notifier){
        notifier.notifyy();
    }

    private void notifyALL(){
        for (Notifier value : this.notifiers) value.notifyy();
    }

    public static void main(String[] args) {
        NotifierHandler notifierHandler = new NotifierHandler();
        Notifier notifier = new EmailNotifier();
        addNotifier(notifier);
        notifierHandler.notifyALL();
    }
}
