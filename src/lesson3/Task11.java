package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] newArray = new int[4];
        int index;
        for (index = 0; index < arr.length; index++) {
            arr[index] = (int) (Math.random() * 11) + 1;
            System.out.print(arr[index] + " ");
        }
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        value++;
        System.arraycopy(arr, 0, newArray, 0, value-1);
        System.arraycopy(arr, value, newArray, value - 1, arr.length-value);
        System.out.println(Arrays.toString(newArray));
    }
}

