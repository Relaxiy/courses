package lesson6_2.Task2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Factory factory = new Factory(new Director("�����", "�������", 40), 4);
        factory.addWorker(new Worker("�������", "�����", 20));
        factory.addWorker(new Worker("������", "���������", 30));
        factory.addWorker(new Worker("�����", "�����", 24));
        factory.addWorker(new Worker("�����", "�������", 36));
        factory.addWorker(new Worker("������", "�����", 22));
        factory.addWorker(new Worker("�����", "������������", 32));
    }
}