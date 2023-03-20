package com.example.BookMovies.Controller;


import com.example.BookMovies.Entities.TheaterEntity;
import com.example.BookMovies.EntryDtos.TheaterEntryDto;
import com.example.BookMovies.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public ResponseEntity addTheater(@RequestBody TheaterEntryDto theaterEntryDto){

        try{
            String result = theaterService.addTheater(theaterEntryDto);
            return new ResponseEntity(result, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }



    }
    @GetMapping("/getAllTheaters")
    public ResponseEntity<List<TheaterEntity>> getAll(){

        List<TheaterEntity>theaters;

        try{
            theaters = theaterService.getAll();
            return new ResponseEntity<>( theaters, HttpStatus.OK);

        }catch (Exception e){


            return new ResponseEntity<>(null,HttpStatus.OK);
        }


    }
}
