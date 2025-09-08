import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = (num % 3 == 0 && num % 5 == 0) ? "Divisible by both 3 and 5" : "Not divisible by both 3 and 5";

        System.out.println(result);

        sc.close();
    }
}
