package lesson4.Task4;

public class Mouse extends Animal{
    public Mouse(String nickname, int age, double weight, String gender) {
        super(nickname, age, weight, gender);
    }

    public void gnaw(){
        System.out.println("I'm gnawing on the wires");
    }
    @Override
    public void voice() {
        System.out.println("I say PI");
    }
}
