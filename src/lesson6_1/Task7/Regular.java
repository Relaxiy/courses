package lesson6_1.Task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    private String str;

    Regular(String str) {
        this.str = str;
    }

    public void check() {
        try {
            String[] strings = str.toUpperCase().split(" ");
            Pattern pattern = Pattern.compile(Commands.valueOf(strings[0]) + "(\s.[A-z].\s)" + Color.valueOf(strings[2]));
            Matcher matcher = pattern.matcher(str.toUpperCase());
            System.out.println(matcher.find());
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong format");
        }

    }
}