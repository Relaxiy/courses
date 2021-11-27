package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
                int value = in.nextInt();
                switch(value) {
                    case 1:
                        System.out.println("1 день");
                        break;
                    case 2, 3, 4:
                        System.out.println(value + " дня");
                        break;
                    case 5, 6, 7, 8, 9:
                        System.out.println(value + " дней");
                        break;
                    default:
                        if (value > 9) {
                            System.out.println("Данная функциональность пока недоступна");
                        } else {
                            System.err.println("Ошибка");
                        }
                }

        }
}
