// 13. Write a program to show the difference between static and instance variables.

class Student{
    int id;
    static String name = "Raghav";
    Student(int id){
        this.id = id;
    }
    void display(){
        System.out.println(id + " "+ name);
    }
}
public class Program13 {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        s1.display();
        s2.display();
        Student.name = "Aman";
        s1.display();
        s2.display();
    }
}
