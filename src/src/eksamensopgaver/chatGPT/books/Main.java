package eksamensopgaver.chatGPT.books;

import java.util.ArrayList;

// 06:46 remaining

public class Main {
    private Library library;

    public static void main(String[] args) {
        new Main().run();
    }

    private void initVars() {
        library = new Library();
    }

    private void run() {
        initVars();

        addBooksToLibrary();
        ArrayList<Book> booksByAuthor = library.findBooksByAuthor("J.K.");

        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle()  + ", " + book.getAuthor() + ", " + book.getGenre());
        }

        System.out.println(library.getTotalBooks());
    }

    private void addBooksToLibrary() {
        library.getBooks().add(new Book("Harry Potter", "J.K.", Genre.FANTASY));
        library.getBooks().add(new Book("Harry Potter 2", "J.K.", Genre.FANTASY));
        library.getBooks().add(new Book("Harry Potter 3", "J.K.", Genre.FANTASY));
        library.getBooks().add(new Book("Harry Potter 4", "J.K.", Genre.FANTASY));
        library.getBooks().add(new Book("Krimibog", "H.C.", Genre.THRILLER));
        library.getBooks().add(new Book("Krimibog", "H.C.", Genre.THRILLER));
    }
}
