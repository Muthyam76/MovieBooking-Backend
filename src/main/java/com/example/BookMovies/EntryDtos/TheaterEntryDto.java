package com.example.BookMovies.EntryDtos;


import lombok.Data;

@Data
public class TheaterEntryDto {

    //Attributes that we require
    private String name;

    private String location;


    private int classicSeatsCount;

    private int premiumSeatsCount;
}

