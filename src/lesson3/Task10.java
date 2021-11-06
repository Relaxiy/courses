package lesson3;

public class Task10 {
    public static void main(String[] args) {
        int[] mass = new int[10];

        int i;
        for(i = 0; i < mass.length; ++i) {
            mass[i] = (int)(Math.random() * 11.0D) + 1;
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        for(i = 0; i < mass.length; ++i) {
            for(int j = 0; j < mass.length; ++j) {
                if (i != j && mass[i] == mass[j] && i > j) {
                    System.out.println(mass[i]);
                }
            }
        }

    }
}
