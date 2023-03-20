package com.example.BookMovies.Repository;

import com.example.BookMovies.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    List<UserEntity> findByName(String name);
}
