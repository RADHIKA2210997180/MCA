// 14. Write a program to use wrapper class methods to convert numbers to binary and hexadecimal.

public class Program14 {
    public static void main(String[] args) {
        int num = 15;
        System.out.println("Binary:"+Integer.toBinaryString(num));
        System.out.println("Hex:"+ Integer.toHexString(num));
    }
}
