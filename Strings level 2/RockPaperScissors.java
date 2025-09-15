import java.util.*;

public class RockPaperScissors {
    static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }
    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        return "computer";
    }
    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / games) + "%";
        return stats;
    }
    static void displayResults(List<String[]> results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.size(); i++) {
            String[] r = results.get(i);
            System.out.println((i+1) + "\t" + r[0] + "\t" + r[1] + "\t" + r[2]);
        }
        System.out.println("\nStats:");
        System.out.println("Player\tWins\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> results = new ArrayList<>();
        int userWins = 0, compWins = 0, games = 0;
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            games++;
            results.add(new String[]{user, comp, winner});
        }
        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(results, stats);
    }
}
