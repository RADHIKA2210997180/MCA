import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int originalNumber = input.nextInt();
        int number = originalNumber;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of digits of number: " + originalNumber + " = " + sum);
        input.close();
    }
}

    

