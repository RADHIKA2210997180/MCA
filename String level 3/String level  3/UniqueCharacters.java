import java.util.Scanner;

public class UniqueCharacters {
    
    // Method to get length of string (without using length())
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // reached end of string
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUnique(String text) {
        int n = getLength(text);
        char[] unique = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean found = false;

            // check if already exists
            for (int j = 0; j < index; j++) {
                if (unique[j] == c) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[index] = c;
                index++;
            }
        }

        // return only filled part
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUnique(text);

        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
