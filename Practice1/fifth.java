import java.util.Scanner;
public class fifth {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate square and cube
        int square = num * num;
        int cube = num * num * num;

        System.out.println("Square of " + num + " is: " + square);
        System.out.println("Cube of " + num + " is: " + cube);

        scanner.close();
    }
}

    
