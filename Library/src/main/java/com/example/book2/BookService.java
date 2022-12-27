package com.example.book2;
import java.util.List;

public interface BookService {

    public String saveBookH(Book book);

    public String editBookH(Book book);

    public String deleteBookH(String id);

    public List<Book>  getBooksH();

    public List<Book> getByGenreH(String genre);
}
