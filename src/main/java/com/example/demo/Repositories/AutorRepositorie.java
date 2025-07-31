package com.example.demo.Repositories;

import com.example.demo.Entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepositorie extends JpaRepository<Autor,Integer> {
}
