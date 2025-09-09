import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Mark: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A\nRemarks: Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: B\nRemarks: Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: C\nRemarks: Average");
        } else if (percentage >= 50) {
            System.out.println("Grade: D\nRemarks: Pass");
        } else {
            System.out.println("Grade: F\nRemarks: Fail");
        }

        input.close();
    }
}

