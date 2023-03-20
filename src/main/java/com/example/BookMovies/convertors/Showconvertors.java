package com.example.BookMovies.convertors;

import com.example.BookMovies.Entities.ShowEntity;
import com.example.BookMovies.EntryDtos.ShowEntryDto;

public class Showconvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                                .build();

        return showEntity;
    }
}
