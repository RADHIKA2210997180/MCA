public class Employee {
    static String companyName = "JCBL";
    static int totalemployee = 0;
    String name;
    int id;
    String designation;
    Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalemployee++;
    }
    public void displayEmployee(){
        if(this instanceof Employee){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.err.println("Designation : "+designation);
        System.out.println("NAME OF THE COMPANY : "+companyName);
        }
    }
    public static void displaytotalemployee(){
      System.out.println("Total employee : "+totalemployee);
    }
}
class EmployeeManagementSystem{
    public static void main(String[] args) {
        Employee e1 = new Employee("Radhika", 01, "JAVA Developer");
        Employee e2 = new Employee("Sehaj", 02, "DataBase Administrator");

        e1.displayEmployee();
        e2.displayEmployee();

        Employee.displaytotalemployee();
    }
}
