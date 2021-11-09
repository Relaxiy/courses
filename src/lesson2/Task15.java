package lesson2;

import java.util.Scanner;

public class Task15 {
    public static double func(double a, double b, double c){
        return  ((b + Math.sqrt((Math.pow(b, 2))) + 4*a*c) / (2*a)) - a*3*c + Math.pow(b, -3);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.println(func(a, b, c));
    }
}

