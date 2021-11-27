package lesson6_1;

public class Task3 {
    private String str;

    Task3(String str) {
        this.str = str;
    }

    public String cut(String substr) {
        if (this.str.contains(substr)) {
            String s = this.str.replace(substr, "");
            return s;
        }
        return "Не содержится в строке";
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3("Hello, mens and women");
        System.out.println(task3.cut("mens"));
    }
}