import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("The character is a vowel.");
                break;
            default:
                System.out.println("The character is a consonant.");
                break;
        }

        sc.close();
    }
}

