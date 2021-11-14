package lesson4.Task4;

public class Cat extends Animal {

    Cat (String nickname, int age, double weight, String gender){
        super(nickname, age, weight, gender);
    }

    public void sleep(){
        System.out.println("I sleep");
    }

    @Override
    public void voice() {
        System.out.println("I say MEOW");
    }
}
