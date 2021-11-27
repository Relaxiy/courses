package lesson6_1.Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Regular regular = new Regular(str);
        regular.check();
    }
}