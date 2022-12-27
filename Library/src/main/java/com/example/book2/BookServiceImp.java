package com.example.book2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp  implements BookService{

    @Autowired
    private BookRepository bookRepo;

    @Override
    public String saveBookH(Book book) {
        bookRepo.save(book);
        return "success";
    }

    @Override
    public String editBookH(Book book) {
        bookRepo.save(book);
        return "success";
    }

    @Override
    public String deleteBookH(String id) {
        if (bookRepo.existsById(id)) {
            bookRepo.deleteById(id);
            return "Deleted Successfully";
        }
        else
            return "No Record Found";
    }

    @Override
    public List<Book> getBooksH() {
        return bookRepo.findAll();
    }

    @Override
    public List<Book> getByGenreH(String genre) {
        return bookRepo.findByGenre(genre);
    }
}
