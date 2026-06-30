package schoolManagement;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (String b : books) {
            System.out.println("- " + b);
        }
    }
}