package lesson3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n = 0;
        boolean bool = true;
        while(bool) {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            switch(s) {
                case "increase":
                    n++;
                    break;
                case "decrease":
                    n--;
                    break;
                case "exit":
                    System.out.println(n);
                    bool = false;
                    break;
                default:
                    System.err.println("error");
                    break;
            }
        }
    }
}

