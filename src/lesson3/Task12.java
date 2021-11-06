package lesson3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n = 0;
        boolean bool = true;

        while(bool) {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            byte var6 = -1;
            switch(s.hashCode()) {
                case 3127582:
                    if (s.equals("exit")) {
                        var6 = 2;
                    }
                    break;
                case 95321666:
                    if (s.equals("increase")) {
                        var6 = 0;
                    }
                    break;
                case 573606046:
                    if (s.equals("decrease")) {
                        var6 = 1;
                    }
            }

            switch(var6) {
                case 0:
                    ++n;
                    break;
                case 1:
                    --n;
                    break;
                case 2:
                    System.out.println(n);
                    bool = false;
                    break;
                default:
                    System.out.println("error");
            }
        }

    }
}

