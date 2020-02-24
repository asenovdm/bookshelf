package com.asenov.bookshelf.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name="books")
@Data 
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Size(min=1,message="Insert the title of the book.")
    private String title;

    @Size(min=3,message="The name of the author should be at least 3 characters long.")
    private String author;

    @ManyToOne
    @JoinColumn(name="genre_id")
    private Genre genre;    
}