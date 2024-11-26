package serviceImpl;

import database.Database;
import models.Book;
import models.Library;
import service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public models.Book saveBook(Long libraryId, models.Book book) {
        Database.books.equals(book);
        return book;
    }

    @Override
    public List<models.Book> getAllBooks(Long libraryId) {
        return Database.books;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (Library library : Database.libraries) {
            if (library.getId() == libraryId) {
                for (models.Book book : Database.books) {
                    if (book.getId() == bookId) {
                        return book;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (int i = 0; i < Database.books.size(); i++) {
            Book book = Database.books.get(i);
            if (book.getId() == (libraryId)) {
                Database.libraries.remove(i); // Удаляем объект из списка
                return "" + libraryId;
            }
        }
        return "" + libraryId;
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        Database.books.clear();
    }
}