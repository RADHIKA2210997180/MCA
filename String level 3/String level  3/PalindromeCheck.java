import java.util.Scanner;

public class PalindromeCheck {
    
    // Logic 1: Iterative two-pointer
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse string and compare
    public static boolean isPalindromeUsingReverse(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check palindrome: ");
        String text = sc.nextLine();

        System.out.println("Logic 1 (Iterative): " + isPalindromeIterative(text));
        System.out.println("Logic 2 (Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Reverse Compare): " + isPalindromeUsingReverse(text));
    }
}
