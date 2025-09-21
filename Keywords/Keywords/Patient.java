public class Patient {
    static String hospitalName = "Neelam Hospital";
    static int totalpatient = 0;
    String name;
    int age;
    String ailment;
    final int patientid;
    Patient(int patientid , String name , int age , String ailment){
        this.patientid=patientid;
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        totalpatient++;
    }
    public void display(){
        if(this instanceof Patient){
        System.out.println("Hospital Name : "+hospitalName);
        System.out.println("Patient ID : "+patientid);
        System.out.println("Patient name : "+name);
        System.out.println("Patient Age : "+age);
        System.out.println("Patient Ailment : "+ailment);
        System.out.println(" ");
        }
    }
    static void totalpatient(){
        System.out.println("Total Number of Patients are : "+totalpatient);
    }
}
class HospitalManagementSystem{
    public static void main(String[] args) {
        Patient p1 = new Patient(01, "Radhika", 21, "Fever");
        Patient p2 = new Patient(02, "Sehaj", 21, "Cold");

        p1.display();
        p2.display();

        Patient.totalpatient();
    }
}
