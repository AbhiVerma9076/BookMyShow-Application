package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<TheaterEntity,Integer> {
}
