// 19. Write a program to check if a long value can be stored in a float variable and display the result.

public class Program19 {
    public static void main(String[] args) {
        long l = 123456789123456789L;
        float f = l;
        System.out.println("Long:"+l);
        System.out.println("Float:"+f);
    }
}
