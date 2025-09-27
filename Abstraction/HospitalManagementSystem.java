abstract class Patient {
    private int id;
     private String name;
      private int age;
    public Patient(int id, String name, int age) { 
        this.id=id; this.name=name; this.age=age; 
    }
    public String getName() { return name; }
    public abstract double calculateBill();
    public void getPatientDetails() { 
        System.out.println("ID: "+id+", Name: "+name+", Age: "+age);
     }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double rate; 
    private int days;
     private String[] records = new String[5]; 
     private int count=0;
    public InPatient(int id,String name,int age,double rate,int days){
        super(id,name,age);
        this.rate=rate;
        this.days=days;
    }
    public double calculateBill(){
         return rate*days; 
        }
    public void addRecord(String r){ 
        if(count<records.length) records[count++]=r;
     }
    public void viewRecords(){ 
        for(int i=0;i<count;i++) 
        System.out.print(records[i]+" "); 
        System.out.println(); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double fee; private String[] records = new String[5]; 
    private int count=0;
    public OutPatient(int id,String name,int age,double fee){
        super(id,name,age); this.fee=fee;
    }
    public double calculateBill(){ 
        return fee; 
    }
    public void addRecord(String r){ 
        if(count<records.length) records[count++]=r; 
    }
    public void viewRecords(){
         for(int i=0;i<count;i++) 
         System.out.print(records[i]+" "); 
         System.out.println();
         }
}

public class HospitalManagementSystem {
    public static void main(String[] args){
        Patient[] patients = {
            new InPatient(1,"Radhika",21,2000,3),
            new OutPatient(2,"Yogita",22,500)
        };

        for(Patient p : patients){
            p.getPatientDetails();
            System.out.println("Bill: "+p.calculateBill());
            if(p instanceof MedicalRecord mr){
                mr.addRecord("Record1");
                mr.viewRecords();
            }
            System.out.println();
        }
    }
}
