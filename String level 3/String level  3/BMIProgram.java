import java.util.Scanner;

public class BMIProgram {
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm to meter
        return weight / (heightM * heightM);
    }

    // Method to find BMI Status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    // Method to process data and store in 2D array
    public static String[][] processBMI(double[][] hwData) {
        String[][] result = new String[hwData.length][3];
        
        for (int i = 0; i < hwData.length; i++) {
            double weight = hwData[i][0];
            double height = hwData[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
            
            result[i][0] = "H:" + height + "cm W:" + weight + "kg";
            result[i][1] = String.format("%.2f", bmi);
            result[i][2] = status;
        }
        return result;
    }

    // Method to display table
    public static void display(String[][] data) {
        System.out.println("Height & Weight\t\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hwData = new double[10][2]; // 10 rows (people), 2 columns (weight, height)
        
        // Take input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            hwData[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i+1) + ": ");
            hwData[i][1] = sc.nextDouble();
        }
        
        // Process & Display
        String[][] result = processBMI(hwData);
        display(result);
    }
}
