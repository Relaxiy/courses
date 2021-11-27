package lesson7.Task3;

import java.util.Scanner;

public class Main {
    public static Season returnEnum(String season) {
        for (Season value:Season.values()) {
            if(value.getSeason().equals(season)){
                return value;
            }
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        try {
            System.out.println(returnEnum(str));
        } catch (RuntimeException e) {
            System.out.println("Такой поры года не существует!!!");
        }

    }
}