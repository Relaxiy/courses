package lesson3;

public class Task5 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int max;
        for(max = 0; max < mass.length; max++) {
            mass[max] = (int)(Math.random() * 11) + 1;
            System.out.print(mass[max] + " ");
        }

        System.out.println();
        max = mass[0];

        for(int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }

        System.out.println(max);
    }
}
