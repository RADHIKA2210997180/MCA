import java.util.Scanner;

public class Seventh {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Taking input for length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Taking input for width
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculating perimeter
        double perimeter = 2 * (length + width);

        // Displaying the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);
 }   
}
