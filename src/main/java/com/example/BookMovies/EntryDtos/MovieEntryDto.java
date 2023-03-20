package com.example.BookMovies.EntryDtos;


import com.example.BookMovies.Enums.Genre;
import com.example.BookMovies.Enums.Language;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
