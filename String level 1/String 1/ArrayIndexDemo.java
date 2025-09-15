import java.util.Scanner;

public class ArrayIndexDemo {
    static String[] names = {"Alice", "Bob", "Charlie"};
    public static void generateException(int index) {
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    public static void handleException(int index) {
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index " + index + " is out of bounds.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The array contains " + names.length + " names.");

        System.out.print("Enter an index to access the name: ");
        int userIndex = scanner.nextInt();

        // generateException(userIndex); 

        handleException(userIndex);

        scanner.close();
    }
}
