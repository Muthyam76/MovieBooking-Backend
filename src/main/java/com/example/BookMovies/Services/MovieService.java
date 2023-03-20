package com.example.BookMovies.Services;


import com.example.BookMovies.Entities.MovieEntity;
import com.example.BookMovies.EntryDtos.MovieEntryDto;
import com.example.BookMovies.Repository.MovieRepository;
import com.example.BookMovies.ResponseDto.MovieDtoConvertor;
import com.example.BookMovies.convertors.MovieConvertors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;




    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);



        return "Movie Added successfully";


    }

    public List<MovieEntryDto> getAll() {
        List<MovieEntity>movies= movieRepository.findAll();
        List<MovieEntryDto>movieEntryDtos=new ArrayList<>();
        for(MovieEntity movie :movies){
            movieEntryDtos.add(MovieDtoConvertor.convertEntityToDto(movie));
        }
        return movieEntryDtos;
    }

    public List<MovieEntryDto> getMovieName(String name) {
        List<MovieEntity>movies= movieRepository.findBymovieName(name);
        List<MovieEntryDto>movieEntryDtos=new ArrayList<>();
        for(MovieEntity movie :movies){
            movieEntryDtos.add(MovieDtoConvertor.convertEntityToDto(movie));
        }
        return movieEntryDtos;

    }
}
