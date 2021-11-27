package lesson6_1;

public class Task6 {
    private String str;

    Task6(String str) {
        this.str = str;
    }

    public int search(String substr) {
        int i = str.indexOf(substr);
        int count = 0;
        while (i >= 0) {
            count++;
            i = str.indexOf(substr, i + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6("Hello, Hello, hello, Hello");
        System.out.println(task6.search("Hello"));
    }
}