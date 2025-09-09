import java.util.Scanner;
public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
            if (data[i][2] < 18.5) status[i] = "Underweight";
            else if (data[i][2] < 25) status[i] = "Normal";
            else if (data[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " - H:" + data[i][1] + " W:" + data[i][0] + " BMI:" + data[i][2] + " Status:" + status[i]);
        }
    }
}
