import java.util.Scanner;

public class CharArrayComparison {
    public static char[] customToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) { 
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] customArray = customToCharArray(input);

        char[] builtInArray = input.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);

        System.out.print("Characters from user-defined method: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }
        System.out.print("\nCharacters from built-in toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println("\nAre both arrays equal? " + areEqual);

        scanner.close();
    }
}
