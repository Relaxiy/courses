package lesson3;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int[] arr = new int[10];
        int k = 0;
        int i;
        for(i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 11) + 1;
        }
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        for(i = 0; i < mass.length-1; i++) {
            for(int j = i+1; j < mass.length; j++) {
                if (mass[i] == mass[j] && mass[i] != arr[k]) {
                    arr[k] = mass[j];
                    System.out.print(arr[k] + " ");
                    k++;
                }
            }
        }
    }
}
