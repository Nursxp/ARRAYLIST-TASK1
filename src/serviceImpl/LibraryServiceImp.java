package serviceImpl;

import database.Database;
import models.Library;
import models.Reader;
import service.LibraryService;

import java.util.Iterator;
import java.util.List;

public class LibraryServiceImp implements LibraryService {

    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        Database.libraries.addAll(libraries);
        return libraries;
    }

    @Override
    public List<Library> getAllLibraries() {
        return Database.libraries;
    }

    @Override
    public Library getLibraryById(Long id) {
        for (Library library : Database.libraries) {
            if (library.getId() == id) {
                return library;
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        Library library1 = getLibraryById(id);
        library1.setId(library1.getId());
        library1.setName(library1.getName());
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {

        for (int i = 0; i < Database.libraries.size(); i++) {
            Library library = Database.libraries.get(i);
            if (library.getId() == (id)) {
                Database.libraries.remove(i); // Удаляем объект из списка
                return "" + id + ".";
            }
        }
        return null;
    }
}