public class seven {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;

        // Spring season: March 20 (3/20) to June 20 (6/20)
        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true;
        } else if (month > 3 && month < 6) {
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
