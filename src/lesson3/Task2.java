package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                int value = in.nextInt();
                switch(value) {
                    case 1:
                        System.out.println("1 день");
                        break;
                    case 2:
                        System.out.println("2 дня");
                        break;
                    case 3:
                        System.out.println("3 дня");
                        break;
                    case 4:
                        System.out.println("4 дня");
                        break;
                    case 5:
                        System.out.println("5 дней");
                        break;
                    case 6:
                        System.out.println("6 дней");
                        break;
                    case 7:
                        System.out.println("7 дней");
                        break;
                    case 8:
                        System.out.println("8 дней");
                        break;
                    case 9:
                        System.out.println("9 дней");
                        break;
                    default:
                        if (value > 9) {
                            System.out.println("Данная функциональность пока недоступна");
                        } else {
                            System.err.println("Ошибка");
                        }
                }
                break;
            }
            else System.out.println("не верный ввод");
        }
    }
}
