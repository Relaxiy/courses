package lesson4.Task31;

public class Example {
    private int task1;
    private int task2;
    private int task3;

    public Example(int task1, int task2, int task3){
        this.task1 = task1;
        this.task2 = task2;
        this.task3 = task3;
    }

    public static void main(String[] args) {
        Example example = new Example(1, 2, 3);
        lesson4.Task32.Example example1 = new lesson4.Task32.Example(1, 1,2);
    }
}
