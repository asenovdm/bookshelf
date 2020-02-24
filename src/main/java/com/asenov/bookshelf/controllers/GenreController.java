package com.asenov.bookshelf.controllers;

import java.util.List;

import com.asenov.bookshelf.entities.Genre;
import com.asenov.bookshelf.repositories.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenreController {

    @Autowired
    private GenreRepository genreRepo;
    
    @GetMapping("/genres")
    public String showAllGenres(Model model){

        List<Genre> genres = genreRepo.findAll();
        model.addAttribute("genres", genres);
        return "readAllGenres";
    }
}