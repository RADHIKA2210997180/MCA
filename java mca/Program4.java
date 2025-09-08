// 4. Write a program to swap two numbers without using a third variable.

public class Program4 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+ a + ", b = "+ b);
    }
}
