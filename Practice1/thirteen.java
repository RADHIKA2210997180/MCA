import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();

        long factorial = 1;
        int i = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            do {
                factorial *= i;
                i++;
            } while (i <= num);

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}

