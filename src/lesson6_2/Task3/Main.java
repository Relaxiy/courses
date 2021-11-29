package lesson6_2.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        StringStore store = new StringStore();
        store.addString(string);

        String[] strings1 = new String[]{"sdfsdf", "sdgsdgsg", "dsgsdsgd"};

        store.addString(strings1);

        System.out.println(store.getStoredString());
    }
}
