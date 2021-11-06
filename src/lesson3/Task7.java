package lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] mass = new int[4][4];

        int i;
        int j;
        for(i = 0; i < mass.length; ++i) {
            for(j = 0; j < mass[i].length; ++j) {
                mass[i][j] = (int)(Math.random() * 11.0D) - 5;
                System.out.print(mass[i][j] + " ");
            }

            System.out.println();
        }

        int minValue = mass[0][0];

        for(i = 0; i < mass.length; ++i) {
            for(j = 0; j < mass[i].length; ++j) {
                if (mass[i][j] < minValue) {
                    minValue = mass[i][j];
                }
            }

            System.out.println();
        }

        System.out.println(minValue);
    }
}

