package lesson4.Task4;

public class Dog extends Animal {
    public Dog(String nickname, int age, double weight, String gender) {
        super(nickname, age, weight, gender);
    }

    public void guard(){
        System.out.println("I am guarding the house");
    }

    @Override
    public void voice() {
        System.out.println("I say GAV");
    }
}
