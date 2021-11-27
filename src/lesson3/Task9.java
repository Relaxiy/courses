package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(4);
        Scanner in = new Scanner(System.in);

        int yourVal;
        do {
            yourVal = in.nextInt();
        } while(yourVal != value);

        System.out.println("Верно: " + yourVal);
    }
}
