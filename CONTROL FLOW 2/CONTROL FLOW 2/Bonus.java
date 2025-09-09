import java.util.Scanner;
class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int service = sc.nextInt();
        if(service > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus is " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}
