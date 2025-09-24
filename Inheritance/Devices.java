class Devices1 {
    int deviceID;
    String status;

    Devices1(int deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }
    void displayStatus() {
        System.out.println("deviceID " + deviceID);
        System.out.println("Status " + status);
    
}
}
class Thermostat extends Devices1{
    int temperatureSetting;


    Thermostat(int temperatureSetting,int deviceID,String status){
        super(deviceID,status);
        this.temperatureSetting=temperatureSetting;
    }
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature  " + temperatureSetting);

    }

}
public class Devices{
    public static void main(String[] args) {
       Thermostat t= new Thermostat(26,1001,"Cool");
        t.displayStatus();
} }