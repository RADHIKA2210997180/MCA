import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] perc = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            phy[i] = sc.nextInt();
            System.out.print("Enter Chemistry marks: ");
            chem[i] = sc.nextInt();
            System.out.print("Enter Maths marks: ");
            math[i] = sc.nextInt();
            perc[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (perc[i] >= 90) grade[i] = 'A';
            else if (perc[i] >= 75) grade[i] = 'B';
            else if (perc[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " - P:" + phy[i] + " C:" + chem[i] + " M:" + math[i] + " %:" + perc[i] + " Grade:" + grade[i]);
        }
    }
}
