import java.util.Scanner;
public class Fourth {
 public static void main(String[] args) {
    final float pie = 3.14f;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of a circle :");
    float radius = sc.nextFloat();
    float area = (pie*radius*radius);
    System.out.print("Area of circle is:"+area);
 }   
}
