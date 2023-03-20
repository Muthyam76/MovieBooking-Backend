package com.example.BookMovies.ResponseDto;

import com.example.BookMovies.Entities.MovieEntity;
import com.example.BookMovies.EntryDtos.MovieEntryDto;

public class MovieDtoConvertor {
    public static MovieEntryDto convertEntityToDto(MovieEntity movieEntity){

        MovieEntryDto movieEntryDto = MovieEntryDto.builder()
                .movieName(movieEntity.getMovieName()).duration(movieEntity.getDuration())
                .genre(movieEntity.getGenre()).language(movieEntity.getLanguage()).ratings(movieEntity.getRatings()).build();

        return movieEntryDto;
    }
}
