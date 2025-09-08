// 20. Write a program to declare a volatile variable and explain its use in multithreading.

class SharedData{
    volatile boolean flag = false;
}
public class Program20 {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Thread writer = new Thread(()->{
            data.flag = true;
            System.out.println("Writer set flag = true");
        });
        Thread reader = new Thread(()->{
            while(!data.flag){}
            System.out.println("Reader detected flag change!");
        });
        reader.start();
        writer.start();
    }
}
