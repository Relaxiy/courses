package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;
        System.out.println(a[0]);
        System.out.println(a[1]);

        for(int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
            System.out.println(a[i]);
        }

    }
}