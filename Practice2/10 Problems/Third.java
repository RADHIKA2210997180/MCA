import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celcius :");
        double temp = sc.nextDouble();
        double feh = (temp*9/5)+32;
        System.out.print("Temperature in feh :"+ feh);
    }
}
