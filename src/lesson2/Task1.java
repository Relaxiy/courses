package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.println(a > 0);
        }

    }
}
