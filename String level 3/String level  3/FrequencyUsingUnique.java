import java.util.Scanner;

public class FrequencyUsingUnique {
    
    // Method to get unique characters
    public static char[] getUniqueChars(String text) {
        char[] unique = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < index; j++) {
                if (unique[j] == c) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[index++] = c;
            }
        }

        // trim to actual size
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    // Method to count frequency of unique characters
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = getUniqueChars(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) {
                    count++;
                }
            }

            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(count);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (String[] row : frequency) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
