package lesson2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner inV1 = new Scanner(System.in);
        Scanner inV2 = new Scanner(System.in);
        if (inV1.hasNextInt() && inV2.hasNextInt()) {
            int val1 = inV1.nextInt();
            int val2 = inV2.nextInt();
            System.out.println(val1 + val2);
        } else System.out.println("wrong");
    }
}
