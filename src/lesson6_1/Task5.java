package lesson6_1;

import java.util.Arrays;

public class Task5 {
    private String str;

    Task5(String str) {
        this.str = str;
    }

    public int[] index(String substr) {
        int[] index = new int[]{this.str.indexOf(substr), this.str.lastIndexOf(substr) + substr.length() - 1};
        return index;
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5("We always says no");
        System.out.println(Arrays.toString(task5.index("always")));
    }
}