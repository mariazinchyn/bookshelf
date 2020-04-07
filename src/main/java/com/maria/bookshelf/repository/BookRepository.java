package com.maria.bookshelf.repository;

import com.maria.bookshelf.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
