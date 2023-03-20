package com.example.BookMovies.Controller;

import com.example.BookMovies.EntryDtos.MovieEntryDto;

import com.example.BookMovies.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {


    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<String> addMovie(@RequestBody MovieEntryDto movieEntryDto){

        try{
            String result = movieService.addMovie(movieEntryDto);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }catch (Exception e){
            String response = "Movie not added";
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAllMovies")
    public ResponseEntity<List<MovieEntryDto>> getMovieByName(){

        List<MovieEntryDto>movies;

        try{
            movies = movieService.getAll();
            return new ResponseEntity<>( movies, HttpStatus.OK);

        }catch (Exception e){


            return new ResponseEntity<>(null,HttpStatus.OK);
        }


    }
    @GetMapping("/get")
    public ResponseEntity<List<MovieEntryDto>> getMovieByName(@RequestParam String name){

        List<MovieEntryDto>movies;

        try{
            movies = movieService.getMovieName(name);
            return new ResponseEntity<>( movies, HttpStatus.OK);

        }catch (Exception e){


            return new ResponseEntity<>(null,HttpStatus.OK);
        }


    }
}
