import java.util.*;

public class StringLength {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int customLen = getLength(str);
        int builtInLen = str.length();
        System.out.println("Custom length: " + customLen);
        System.out.println("Built-in length: " + builtInLen);
    }
}
