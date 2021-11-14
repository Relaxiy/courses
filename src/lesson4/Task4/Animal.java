package lesson4.Task4;

public abstract class Animal {
    private String nickname;
    private int age;
    private double weight;
    private String gender;

    public abstract void voice();

    Animal(String nickname, int age, double weight, String gender){
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    protected void show(){
        System.out.println(this.nickname + " " + this.age + " " + this.weight + " " + this.gender);
    }
}
