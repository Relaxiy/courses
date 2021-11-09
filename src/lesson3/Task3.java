package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intervalFrom = in.nextInt();
        int intervalTo = in.nextInt();
        for (int i = intervalFrom + 1; i < intervalTo; i++){
            System.out.println(i);
        }
    }
}