package lesson2;

import java.util.Scanner;

public class Task15 {
    public static double func(double a, double b, double c) {
        double rez = (b + Math.sqrt(Math.pow(b, 2.0D) + 4.0D * a * c)) / (2.0D * a) - a * 3.0D * c + Math.pow(b, -3.0D);
        return rez;
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

