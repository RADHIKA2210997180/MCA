import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);
    }
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
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
