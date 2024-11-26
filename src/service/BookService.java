package service;

import models.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Long libraryID, models.Book book);

    List<Book> getAllBooks(Long libraryId);

    Book getBookById(Long library, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    void clearBooksByLibraryId(Long libraryId);
}
