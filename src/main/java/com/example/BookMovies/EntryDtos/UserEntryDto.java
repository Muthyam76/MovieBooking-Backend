package com.example.BookMovies.EntryDtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntryDto {


    private String name;

    private int age;

    private String email;

    private String mobNo;

    private String address;
}
