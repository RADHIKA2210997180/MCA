import java.util.Scanner;

public class StringIndexDemo {
    public static void generateException(String text) {
        System.out.println("Character at position 100: " + text.charAt(100));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Character at position 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index out of bounds! The string is too short.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // generateException(userInput);

        handleException(userInput);

        scanner.close();
    }
}
