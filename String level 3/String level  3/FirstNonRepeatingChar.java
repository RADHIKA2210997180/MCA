import java.util.Scanner;

public class FirstNonRepeatingChar {
    
    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // ASCII size

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Find first char with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // no unique character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result == '\0')
            System.out.println("No non-repeating character found.");
        else
            System.out.println("First non-repeating character: " + result);
    }
}
