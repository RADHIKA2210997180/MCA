// 7. Write a program to print default values of instance variables in a class.

public class Program7 {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean flag = true;
    public static void main(String[] args) {
        Program7 obj = new Program7();
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
