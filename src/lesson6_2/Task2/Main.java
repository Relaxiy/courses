package lesson6_2.Task2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Factory factory = new Factory(new Director("Алина", "Каллаур", 40), 4);
        factory.addWorker(new Worker("Алексей", "Новак", 20));
        factory.addWorker(new Worker("Ульяна", "Сергеевна", 30));
        factory.addWorker(new Worker("Илона", "Сосна", 24));
        factory.addWorker(new Worker("Павел", "Пищулин", 36));
        factory.addWorker(new Worker("Андрей", "Белик", 22));
        factory.addWorker(new Worker("Слава", "Коммисаренко", 32));
    }
}