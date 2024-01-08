package Problema2;

public class Main {
    public static void main(String[] args) {
        // Crearea câtorva instanțe de Book
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "978-0-19-953556-9");
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0-618-26030-0");
        // Crearea unei instanțe de Library
        Library library = new Library();

        // Adăugarea cărților în bibliotecă
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        System.out.println("\nBooks in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }


        library.removeBook(book2);


        System.out.println("\nBooks remaining in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}