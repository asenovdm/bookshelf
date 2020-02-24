package com.asenov.bookshelf.repositories;

import com.asenov.bookshelf.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

    
}