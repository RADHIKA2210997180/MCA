import java.util.*;

public class DeckOfCards {
    
    // Method to create deck
    public static String[] createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length; // 52 cards
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    
    // Method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            // swap
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    
    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be evenly distributed!");
            return null;
        }
        
        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];
        
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }
    
    // Method to print players and their cards
    public static void printPlayers(String[][] distributed) {
        if (distributed == null) return;
        
        for (int i = 0; i < distributed.length; i++) {
            System.out.println("Player " + (i+1) + ": ");
            for (int j = 0; j < distributed[i].length; j++) {
                System.out.println("   " + distributed[i][j]);
            }
            System.out.println();
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Create and shuffle deck
        String[] deck = createDeck();
        shuffleDeck(deck);
        
        // Step 2: Input players and cards
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        
        // Step 3: Distribute and print
        String[][] distributed = distributeCards(deck, n, players);
        printPlayers(distributed);
    }
}
