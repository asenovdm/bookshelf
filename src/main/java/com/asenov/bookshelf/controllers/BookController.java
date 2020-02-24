package com.asenov.bookshelf.controllers;

import java.util.List;

import javax.validation.Valid;

import com.asenov.bookshelf.entities.Book;
import com.asenov.bookshelf.entities.Genre;
import com.asenov.bookshelf.repositories.BookRepository;
import com.asenov.bookshelf.repositories.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private GenreRepository genreRepo;
    
    @GetMapping("/books") 
    public String showAllBooks(Model model){
        List<Book> books = bookRepo.findAll();
        model.addAttribute("books", books); 
        return "readAllBooks";           
    }
    
    
    @GetMapping("/genre/{id}") 
    public String showAllBooksByGenre(@PathVariable int id, Model model){
        List<Book> books = bookRepo.findByGenreId(id);
        model.addAttribute("books", books); 
        return "readAllBooksByGenre";        
    }

    @GetMapping("/add") 
    public String addBook(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        List<Genre> genres = genreRepo.findAll();
        model.addAttribute("genres", genres);
        return "create";           
    }

    @PostMapping("/add")
    public String handleAddBookForm(@Valid Book book, BindingResult result, Model model){
        if(result.hasErrors()){ 
            List<Genre> genres = genreRepo.findAll();
            model.addAttribute("genres", genres);
            return "create"; 
        }
        bookRepo.save(book);
        return "redirect:/books";
    }

    @GetMapping("/update/{id}")
    public String updateBook(@PathVariable int id, Model model){
        Book book = bookRepo.getOne(id);
        model.addAttribute("book", book);
        List<Genre> genres = genreRepo.findAll();
        model.addAttribute("genres", genres);
        return "update";
    }

    @PostMapping("/update")
    public String handleUpdateBookForm(@Valid Book book, BindingResult result, Model model){
        if(result.hasErrors()){ 
            List<Genre> genres = genreRepo.findAll();
            model.addAttribute("genres", genres);
            return "create"; 
        }
        bookRepo.save(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookRepo.deleteById(id);
        return "redirect:/books";
    }
}