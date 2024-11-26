package service;

import models.Reader;

import java.util.List;

public interface ReaderService {
    void saveReader(Reader reader);

    List<models.Reader> getAllReaders();

    models.Reader getReaderById(Long id);

    Reader updateReader(Long id, models.Reader reader);

    void assignReaderToLibrary(Long readerId, Long libraryId);
}
