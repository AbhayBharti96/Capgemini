package HasARelationShip;
class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("-------------------");
    }
}

class Library {
    Book[] books;   // Aggregation (HAS-A)

    Library(Book[] books) {
        this.books = books;
    }

    void displayLibraryBooks() {
        System.out.println("Library Books:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class Solution02{
    public static void main(String[] args) {

        // Book objects exist independently
        Book b1 = new Book(101, "Java Basics", "James Gosling");
        Book b2 = new Book(102, "Python Guide", "Guido van Rossum");
        Book b3 = new Book(103, "Data Structures", "Mark Allen");

        Book[] bookList = { b1, b2, b3 };

        // Library uses Book objects
        Library lib = new Library(bookList);
        lib.displayLibraryBooks();
    }
}

