package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int numberFib2;
        int numberFib0 = 1;
        int numberFib1 = 1;
        System.out.println(numberFib0);
        System.out.println(numberFib1);
        for(int i = 2; i < n; i++) {
            numberFib2 = numberFib0 + numberFib1;
            System.out.println(numberFib2);
            numberFib0 = numberFib1;
            numberFib1 = numberFib2;
        }
    }
}