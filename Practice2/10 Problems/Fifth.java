import java.util.Scanner;
public class Fifth {
 public static void main(String[] args) {
    final float pie = 3.14f;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of cylinder :");
    float radius = sc.nextFloat();
    System.out.print("Enter height of cylinder :");
    float height = sc.nextFloat();
    float volume = pie*radius*radius*height;
    System.out.print("Volume of cylinder is :"+volume);
 }   
}
