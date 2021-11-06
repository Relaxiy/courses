package lesson3;

public class Task8 {
    public static void main(String[] args) {
        int[][] mass = new int[4][4];
        int[] sum = new int[4];
        int i;
        int j;
        for(i = 0; i < mass.length; i++) {
            for(j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int)(Math.random() * 11) - 5;
                System.out.print(mass[i][j] + " ");
            }

            System.out.println();
        }

        for(i = 0; i < mass.length; i++) {
            for(j = 0; j < mass[i].length; j++) {
                sum[i] += mass[j][i];
            }
        }

        System.out.println();

        for(i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

    }
}

