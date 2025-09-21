public class Book {
    String title;
    String author;
    final String isbn;
    static String libraryname = "My Library";
    Book(String isbn, String title , String author){
        this.isbn = isbn;
        this.title=title;
        this.author=author;
    }
    public void displayBookDetail(){
     if(this instanceof Book){
     System.out.println("ISBN CODE : "+isbn);
     System.out.println("Title of Book :"+title);
     System.out.println("Author of Book :"+author);
     }
    }
    public static void displaylibraryname(){
        System.out.println("Library Name : "+libraryname);
    }
}
class LibraryManagementSystem{
    public static void main(String[] args) {
        Book b1 = new Book("12-34-56", "JAVA BOOK", "Radhika");
        Book b2 = new Book("65-43-21", "MySQL", "Sehaj");

        b1.displayBookDetail();
        b2.displayBookDetail();

        Book.displaylibraryname();  
    }
}
