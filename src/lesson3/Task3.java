package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        while(true) {
            Scanner inA = new Scanner(System.in);
            Scanner inB = new Scanner(System.in);
            if (inA.hasNextInt() && inB.hasNextInt()) {
                int a = inA.nextInt();
                int b = inB.nextInt();
                while(a < b - 1) {
                    a++;
                    System.out.println(a);
                }
                break;
            } else System.out.println("ошибка");
        }
    }
}
