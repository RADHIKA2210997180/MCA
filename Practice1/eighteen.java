import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                break;
            }
            System.out.print(input.charAt(i));
        }
        System.out.println();

        sc.close();
    }
}
