import java.util.Scanner;

public class UpperCaseComparison {
    public static String manualToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
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

        String builtInUpper = input.toUpperCase();

        String manualUpper = manualToUpperCase(input);

        boolean areEqual = compareStrings(builtInUpper, manualUpper);

        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("Manual toUpperCase():   " + manualUpper);
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
