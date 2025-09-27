abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract int getLoanDuration(); 

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() { return 14; }

    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            borrower = borrowerName;
            isAvailable = false;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is not available");
        }
    }

    public boolean checkAvailability() { return isAvailable; }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() { return 3; } 

    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            borrower = borrowerName;
            isAvailable = false;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is not available");
        }
    }

    public boolean checkAvailability() { return isAvailable; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(101, "Java Programming", "John Doe"),
            new Magazine(102, "Time Magazine", "Various"),
            new DVD(103, "Inception", "Christopher Nolan")
        };

       
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable r) {
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Radhika");
                System.out.println("Available after reservation: " + r.checkAvailability());
            }
            System.out.println();
        }
    }
}
