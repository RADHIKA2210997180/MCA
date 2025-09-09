import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Factorial not defined for negative numbers");
            input.close();
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        input.close();
    }
}
