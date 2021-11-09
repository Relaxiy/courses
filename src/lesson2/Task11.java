package lesson2;

public class Task11 {
    public static void main(String[] args) {
        int t = 36670;
        int hours = t/3600;
        int minutes = (t - hours*3600)/60;
        int seconds = t - (minutes*60 + hours*3600);
        System.out.println( hours + "ч " + minutes + "мин " + seconds + "с");
    }
}
