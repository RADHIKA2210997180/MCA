import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            if (value <= 0) {
                break;  // Exit loop if 0 or negative number is entered
            }

            total += value;
        }

        System.out.println("The total sum is: " + total);
        input.close();
    }
}

