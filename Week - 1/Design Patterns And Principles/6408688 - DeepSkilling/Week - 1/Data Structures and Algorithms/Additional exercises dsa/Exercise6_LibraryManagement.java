
import java.util.Arrays;

class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book b) {
        return this.title.compareToIgnoreCase(b.title);
    }

    @Override
    public String toString() {
        return bookId + ": " + title + " by " + author;
    }
}

public class Exercise6_LibraryManagement {
    static Book[] books = {
        new Book(101, "The Alchemist", "Paulo Coelho"),
        new Book(102, "1984", "George Orwell"),
        new Book(103, "To Kill a Mockingbird", "Harper Lee")
    };

    public static void linearSearch(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + b);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void binarySearch(String title) {
        Arrays.sort(books);
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) {
                System.out.println("Found: " + books[mid]);
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        linearSearch("1984");
        binarySearch("To Kill a Mockingbird");
    }
}
