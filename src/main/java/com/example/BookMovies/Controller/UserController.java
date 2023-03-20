package com.example.BookMovies.Controller;

import com.example.BookMovies.EntryDtos.UserEntryDto;
import com.example.BookMovies.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserEntryDto userEntryDto){

        try{
            String response = userService.addUser(userEntryDto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        }catch (Exception e){

            String result = e+"";//"User could not be added";
            return new ResponseEntity<>(result,HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/get")
    public ResponseEntity<List<UserEntryDto>> getUserByName(@RequestParam String name){

        List<UserEntryDto>users;

        try{
            users = userService.getUserByName(name);
            return new ResponseEntity<>( users, HttpStatus.OK);

        }catch (Exception e){


            return new ResponseEntity<>(null,HttpStatus.OK);
        }


    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserEntryDto>>getAllUsers(){

        List<UserEntryDto>users;

        try{
            users = userService.getAllUsers();
            return new ResponseEntity<>( users, HttpStatus.OK);

        }catch (Exception e){


            return new ResponseEntity<>(null,HttpStatus.OK);
        }


    }



}
