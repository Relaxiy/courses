package lesson2;

import java.util.Scanner;

public class Task14 {
    public static double func(double a, double b, double c){
        return (a - 3)*b/2 + c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.println(func(a, b, c));
    }
}
