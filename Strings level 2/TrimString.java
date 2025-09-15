import java.util.*;

public class TrimString {
    static int[] findBounds(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }
    static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) result += s.charAt(i);
        return result;
    }
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String text = sc.nextLine();
        int[] bounds = findBounds(text);
        String custom = customSubstring(text, bounds[0], bounds[1]);
        String builtin = text.trim();
        boolean same = compareStrings(custom, builtin);
        System.out.println("Custom Trim: '" + custom + "'");
        System.out.println("Built-in Trim: '" + builtin + "'");
        System.out.println("Match: " + same);
    }
}

