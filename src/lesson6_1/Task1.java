package lesson6_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String str = "https://my-site.com";
        Pattern pattern = Pattern.compile("(http://|https://)(my-site).(com|ru|by)");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
        String str1 = str.replace("my-site", "my-hidden-site");
        System.out.println(str1);
    }
}