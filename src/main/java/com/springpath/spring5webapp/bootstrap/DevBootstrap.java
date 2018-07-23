package com.springpath.spring5webapp.bootstrap;

import com.springpath.spring5webapp.model.Author;
import com.springpath.spring5webapp.model.Book;
import com.springpath.spring5webapp.model.Publisher;
import com.springpath.spring5webapp.repositories.AuthorRepository;
import com.springpath.spring5webapp.repositories.BookRepository;
import com.springpath.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Hamid Barakat
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private  AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
               this.authorRepository = authorRepository;
                this.bookRepository = bookRepository;
               this.publisherRepository = publisherRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public AuthorRepository getAuthorRepository() {
        return authorRepository;
    }

    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void initData(){
        Publisher publisher =new Publisher("Nido","m12");
        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");


        Book  ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444",publisher );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}
