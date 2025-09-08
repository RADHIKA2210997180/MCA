// 9. Write a program to demonstrate autoboxing and unboxing.

public class Program9 {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;
        int b = obj;
        System.out.println("Autoboxed:"+obj);
        System.out.println("Unboxed:"+b);
    }
}
