package lesson2;

import java.util.Scanner;

public class Task14 {
    public static double func(double a, double b, double c) {
        return (a - 3.0D) * b / 2.0D + c;
    }

    public static void main(String[] args) {
        while(true) {
            Scanner inA = new Scanner(System.in);
            Scanner inB = new Scanner(System.in);
            Scanner inC = new Scanner(System.in);
            if (inA.hasNextDouble() && inB.hasNextDouble() && inC.hasNextDouble()) {
                double a = inA.nextDouble();
                double b = inB.nextDouble();
                double c = inC.nextDouble();
                System.out.println(func(a, b, c));
                return;
            }

            System.out.println("wrong");
        }
    }
}
