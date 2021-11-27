package lesson7.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 2, 5, 7, 6, 1, 4, 2};
        try {
            Scanner in = new Scanner(System.in);
            int index = in.nextInt();
            System.out.println(array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds of array, by default the first element is displayed: "
                    + array[0]);
        }catch (InputMismatchException e){
            System.out.println("String entered, by default the first item is output: "
                    + array[0]);
        }
    }
}
