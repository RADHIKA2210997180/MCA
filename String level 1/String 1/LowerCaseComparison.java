import java.util.Scanner;

public class LowerCaseComparison {
    public static String manualToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }

        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String builtInLower = input.toLowerCase();

        String manualLower = manualToLowerCase(input);

        boolean areEqual = compareStrings(builtInLower, manualLower);

        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Manual toLowerCase():   " + manualLower);
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
