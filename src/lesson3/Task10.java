package lesson3;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int[] arr = new int[10];
        int k = 0;
        int i;
        for(i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 11.0D) + 1;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        Arrays.sort(mass);
        for(i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass.length - 1; j++) {
                if (mass[i] == mass[j] && mass[i] != arr[k]) {
                    arr[k] = mass[j];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
