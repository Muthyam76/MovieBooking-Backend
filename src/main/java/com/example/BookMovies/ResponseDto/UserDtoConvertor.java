package com.example.BookMovies.ResponseDto;

import com.example.BookMovies.Entities.UserEntity;
import com.example.BookMovies.EntryDtos.UserEntryDto;

public class UserDtoConvertor {
    public static UserEntryDto convertEntityToDto(UserEntity userEntity){

        UserEntryDto userEntryDto =  UserEntryDto.builder().age(userEntity.getAge()).address(userEntity.getAddress())
                .email(userEntity.getEmail()).name(userEntity.getName()).mobNo(userEntity.getMobNo())
                .build();

        return userEntryDto;

    }
}
