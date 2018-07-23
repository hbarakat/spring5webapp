package com.springpath.spring5webapp.repositories;

import com.springpath.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Hamid Barakat
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
