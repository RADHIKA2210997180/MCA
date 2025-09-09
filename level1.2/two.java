import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = input.nextDouble();

        
        double areaCm = 0.5 * base * height;

        
        double areaIn = areaCm / (2.54 * 2.54); 

        
        System.out.println("\nThe Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        input.close();
    }
}
