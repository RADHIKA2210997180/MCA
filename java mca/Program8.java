// 8. Write a program to demonstrate implicit and explicit type casting.

public class Program8 {
    public static void main(String[] args) {
        int i = 100;
        double d = i;
        System.out.println("Implicit:"+d);

        double x = 9.78;
        int y = (int) x;
        System.out.println("Explicit:"+y);
    }
}
