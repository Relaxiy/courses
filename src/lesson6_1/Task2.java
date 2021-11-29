package lesson6_1;

public class Task2 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello, world!");
        str.reverse();
        str.append(" it's me");
        int length = str.length();
        if (length % 2 != 0) {
            str.delete(length / 2 - 1, length / 2);
        }
        System.out.println(str);
    }
}