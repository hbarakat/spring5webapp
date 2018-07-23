package com.springpath.spring5webapp.repositories;

 import com.springpath.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Hamid Barakat
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
