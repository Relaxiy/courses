package lesson3;

public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[10];

        int i;
        for(i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 11) + 1;
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        for(i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                System.out.print(mass[i] + " ");
            }
        }

    }
}