import java.util.*;

public class DeckOfCards {
    
    
    public static String[] createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length; 
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    
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
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] deck = createDeck();
        shuffleDeck(deck);
        
        
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        
       
        String[][] distributed = distributeCards(deck, n, players);
        printPlayers(distributed);
    }
}
