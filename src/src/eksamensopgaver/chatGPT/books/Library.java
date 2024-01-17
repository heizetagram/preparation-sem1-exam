package eksamensopgaver.chatGPT.books;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public int getTotalBooks() {
        return books.size();
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
