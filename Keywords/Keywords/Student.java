public class Student {
    static String uniname = "Chitkara University";
    static int totalstudents = 0;
    String name;
    final int rollno;
    String grade;
    Student(String name , int rollno , String grade){
        this.name=name;
        this.rollno=rollno;
        this.grade=grade;
        totalstudents++;
    }
    public void display(){
        if(this instanceof Student){
        System.out.println("University Name : "+uniname);
        System.out.println("Name : "+name);
        System.out.println("Roll No: "+ rollno);
        System.out.println("Grade : "+grade);
        System.out.println(" ");
        }
    }
    public static void totalstudents(){
        System.out.println("Total Number of Students are : "+totalstudents);
    }
}
class UniversityStudentManagement{
    public static void main(String[] args) {
        Student s1 = new Student("Radhika", 01, "A");
        Student s2 = new Student("Sehaj", 02, "B");

        s1.display();
        s2.display();

        Student.totalstudents();
    }
}
