import java.util.ArrayList;
// The import statement above is used to bring in the ArrayList class from the java.util package.

public class library {

    // Book class
    static class Book {
        String title, author, publisher;
        int yearPublished;
        String isbn;

        Book(String title, String author, String publisher, int yearPublished, String isbn) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.yearPublished = yearPublished;
            this.isbn = isbn;
        }
    }

    // Catalog as a list of books
    private ArrayList<Book> catalog;
    //ArrayList class is a part of the Java Collections Framework, which is included in the java.util package.

    // Constructor
    library() {
        catalog = new ArrayList<>();
    }

    // Add book
    public void addBook(Book b) {
        catalog.add(b);
    }
// The addBook method is a public function that takes a Book object as a parameter and adds it to
// the catalog. The catalog is an ArrayList<Book> that stores a collection of Book objects,
// representing the library's catalog. This method facilitates the addition of new books to the
// catalog, allowing for dynamic management of the library's collection.



    // Display catalog
    public void displayCatalog() {
        for (Book b : catalog) {
            System.out.println(
                    b.title + ", " + b.author + ", " + b.publisher + ", " + b.yearPublished + ", " + b.isbn);
        }
    }

    public static void main(String[] args) {

        // Create two Book objects
        Book book1 = new Book("block book", "Joshua", "Addison", 2017, "978-0134685991");
        Book book2 = new Book("bug bounty", "Robert", "Prentice", 2008, "978-0132350884");

        // Add books to catalog
        library catalog = new library();  // Use the same class name here
        catalog.addBook(book1);
        catalog.addBook(book2);

        // Display catalog
        catalog.displayCatalog();
    }
}
