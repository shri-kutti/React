package com.example.book2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookRestController {

    @Autowired
    private BookService bookService;

    @PostMapping("/saveBook")
    public ResponseEntity<String> addBook(@RequestBody Book book){

        String status = bookService.saveBookH(book);
        return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
    }

    @PostMapping("/editBook")
    public ResponseEntity<String> editBook(@RequestBody Book book, @RequestParam(name="bookId") String bID){

        book.setBookId(bID);
        String status = bookService.saveBookH(book);
        return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<String> deleteBook(@RequestParam(name="bookId") String bID){
        String status = bookService.deleteBookH(bID);
        return new ResponseEntity<>(status,HttpStatus.OK);

    }

    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> getAllBooks()
    {
        List<Book> allBooks = bookService.getBooksH();
        return new ResponseEntity<>(allBooks,HttpStatus.OK);
    }
    @GetMapping("/getByType")
    public ResponseEntity<List<Book>> getBookByGenre(@RequestParam(name="id") String BID )
    {
        List<Book> allBooks = bookService.getByGenreH(BID);
        return new ResponseEntity<>(allBooks,HttpStatus.OK);
    }


}
