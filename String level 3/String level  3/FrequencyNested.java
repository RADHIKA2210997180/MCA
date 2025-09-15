import java.util.Scanner;

public class FrequencyNested {
    
    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        // Initialize frequencies
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        // Count frequency with nested loops
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue; // already counted

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Store results in String array
        String[] result = new String[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " -> " + freq[i];
            }
        }

        // Trim result
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = findFrequency(text);

        System.out.println("Character Frequencies:");
        for (String s : frequency) {
            System.out.println(s);
        }
    }
}
