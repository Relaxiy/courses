package lesson4.Task5;

public class NotifierHandler {
    public static void addNotifier(Notifier notifier){
        notifier.notifyy();
    }

    public static void notifyALL(Notifier[] notifiers){
        for (Notifier value : notifiers) value.notifyy();
    }

    public static void main(String[] args) {
        Notifier[] notifier = new Notifier[3];
        notifier[0] = new EmailNotifier();
        notifier[1] = new SMSNotifier();
        notifier[2] = new MessengerNotifier();
        addNotifier(notifier[0]);
        notifyALL(notifier);
    }
}
