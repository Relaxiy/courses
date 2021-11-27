
package lesson6_1;

public class Task8 {
    public Task8() {
    }

    public static void main(String[] args) {
        String str = "hello, i'm fine";
        char[] charArray = str.toCharArray();
        str = "";
        for(int i = charArray.length - 1; i >= 0; --i) {
            str = str + charArray[i];
        }
        System.out.println(str);
    }
}