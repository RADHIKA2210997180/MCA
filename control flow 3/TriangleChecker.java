import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angleX = input.nextInt();
        int angleY = input.nextInt();
        int angleZ = input.nextInt();

        int sumOfAngles = angleX + angleY + angleZ;

        System.out.println("The given angles " + angleX + ", " + angleY + ", " + angleZ + 
                           " add to " + sumOfAngles);

        if (sumOfAngles == 180) {
            System.out.println("The given angles are internal angles of a Triangle");
        } else {
            System.out.println("The given angles are not internal angles of a Triangle");
        }

        input.close();
    }
}
