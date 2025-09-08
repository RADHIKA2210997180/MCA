// 1. Write a Java program to declare and print all primitive data types.

public class Program1{
    byte b = 100;
    short s = 20000;
    int i = 100000;
    long l = 1000000000;
    float f = 3.14f;
    double d = 99.99;
    char c = 'A';
    boolean flag = true;

    public static void main(String[] args) {
        Program1 obj = new Program1();
        System.out.println("byte = "+ obj.b);
        System.out.println("short = "+obj.s);
        System.out.println("int = "+obj.i);
        System.out.println("long = "+obj.l);
        System.out.println("float = "+obj.f);
        System.out.println("double = "+obj.d);
        System.out.println("char = "+obj.c);
        System.out.println("boolean = "+obj.flag);
    }
}