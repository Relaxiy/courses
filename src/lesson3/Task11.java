package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] mass = new int[5];
        int[] newArray = null;

        int index;
        for(index = 0; index < mass.length; ++index) {
            mass[index] = (int)(Math.random() * 11.0D) + 1;
            System.out.print(mass[index] + " ");
        }

        int indexValue = 0;

        while(true) {
            Scanner in = new Scanner(System.in);
            index = in.nextInt();
            if (index <= mass.length - 1) {
                label39:
                for(int i = 0; i < mass.length; ++i) {
                    if (i == index) {
                        newArray = new int[mass.length - 1];
                        indexValue = mass[i];

                        int j;
                        for(j = 0; j < i; ++j) {
                            newArray[j] = mass[j];
                        }

                        j = i;

                        while(true) {
                            if (j >= mass.length - 1) {
                                break label39;
                            }

                            newArray[j] = mass[j + 1];
                            ++j;
                        }
                    }
                }

                System.out.println("Value: " + indexValue + "\nArray: " + Arrays.toString(newArray));
                return;
            }

            System.out.println("Error");
        }
    }
}

