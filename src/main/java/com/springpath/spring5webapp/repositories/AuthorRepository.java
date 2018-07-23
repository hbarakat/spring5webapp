package com.springpath.spring5webapp.repositories;

import com.springpath.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Hamid Barakat
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
