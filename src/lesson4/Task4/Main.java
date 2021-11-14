package lesson4.Task4;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tereza", 2, 12.4, "male");
        cat.show();
        cat.voice();
        cat.sleep();

        Animal cat1 = new Cat("Tereza", 2, 12.4, "female");
        cat1.show();
        cat1.voice();

        Dog dog = new Dog("Eteri", 4, 22.45, "male");
        dog.show();
        dog.voice();
        dog.guard();

        Animal dog1 = new Dog("Eteri", 4, 22.45, "female");
        dog1.show();
        dog1.voice();

        Mouse mouse = new Mouse("Chou", 1, 0.43, "female");
        mouse.show();
        mouse.voice();
        mouse.gnaw();

        Animal mouse1 = new Mouse("Chou", 1, 0.43, "male");
        mouse1.show();
        mouse1.voice();

        System.out.println(cat1 instanceof Animal);
        System.out.println(cat1 instanceof Cat);
        System.out.println(cat1 instanceof Dog);
    }
}
