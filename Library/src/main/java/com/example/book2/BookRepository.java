package com.example.book2;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {

   List<Book> findByGenre(String genre);
}
