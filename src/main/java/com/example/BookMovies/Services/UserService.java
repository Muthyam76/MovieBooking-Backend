package com.example.BookMovies.Services;


import com.example.BookMovies.Entities.UserEntity;
import com.example.BookMovies.EntryDtos.UserEntryDto;
import com.example.BookMovies.Repository.UserRepository;
import com.example.BookMovies.ResponseDto.UserDtoConvertor;
import com.example.BookMovies.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }


    public List<UserEntryDto> getUserByName(String name) {
        List<UserEntity>users= userRepository.findByName(name);
        List<UserEntryDto>userEntryDtos=new ArrayList<>();
        for(UserEntity user :users){
            userEntryDtos.add(UserDtoConvertor.convertEntityToDto(user));
        }
        return userEntryDtos;

   }

    public List<UserEntryDto> getAllUsers() {
        List<UserEntity>users= userRepository.findAll();
        List<UserEntryDto>userEntryDtos=new ArrayList<>();
        for(UserEntity user :users){
            userEntryDtos.add(UserDtoConvertor.convertEntityToDto(user));
        }
        return userEntryDtos;
    }


}
