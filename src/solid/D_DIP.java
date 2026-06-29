package solid;

interface Book { void readDescription(); }

class Novel implements Book {
    public void readDescription() { System.out.println("Reading a sci-fi novel story."); }
}
class Library {
    private Book book;
    public Library(Book book) { this.book = book; }
    public void openBook() { book.readDescription(); }
}

public class D_DIP {
    public static void main(String[] args) {
        Library myLibrary = new Library(new Novel());
        myLibrary.openBook();
    }
}