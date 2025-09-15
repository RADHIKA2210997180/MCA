import java.util.Scanner;

public class SubstringComparison {

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String substringCharAt = customSubstring(input, start, end);
        String substringBuiltin = input.substring(start, end);

        boolean areEqual = compareStrings(substringCharAt, substringBuiltin);

        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltin);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}
