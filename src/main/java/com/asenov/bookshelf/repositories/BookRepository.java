package com.asenov.bookshelf.repositories;

import java.util.List;

import com.asenov.bookshelf.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByGenreId(int id); 
}