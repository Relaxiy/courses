package lesson3;

public class Task6 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int sum = 0;

        int i;
        for(i = 0; i < mass.length; ++i) {
            mass[i] = (int)(Math.random() * 11.0D) - 5;
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        for(i = 0; i < mass.length; ++i) {
            if (mass[i] > 0 && mass[i] % 2 == 0) {
                sum += mass[i];
            }
        }

        System.out.println(sum);
    }
}
