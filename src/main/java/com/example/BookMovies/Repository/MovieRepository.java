package com.example.BookMovies.Repository;

import com.example.BookMovies.Entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {




    List<MovieEntity> findBymovieName(String name);
}
