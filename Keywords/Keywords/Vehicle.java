public class Vehicle {
    static int registrationfee = 100;
    String ownername;
    String vehicletype;
    final String registrationNo;
    Vehicle(String ownername , String vehicletype , String registrationNo){
        this.ownername=ownername;
        this.vehicletype=vehicletype;
        this.registrationNo = registrationNo;
    }
    public void display(){
        System.out.println("Owner Name : "+ownername);
        System.out.println("Vehicle Type :"+vehicletype);
        System.out.println("Registration Number : "+registrationNo);
        System.out.println("Fees for Registration : "+registrationfee);
        System.out.println(" ");
    }
    public static void updatefee(int newfee){
        registrationfee = newfee;
        System.out.println("Fees After Updation : "+registrationfee);
    }
}
class VehicleRegistrationSystem{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Radhika", "XUV", "10-S1/40");
        Vehicle v2 = new Vehicle("Sehaj", "Sedan", "20-S1/30");

        v1.display();
        v2.display();

        Vehicle.updatefee(500);
    }
}
