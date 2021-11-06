package lesson2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String name = in.nextLine();
            System.out.println(name);
        } else {
            System.out.println("wrong");
        }

    }
}
