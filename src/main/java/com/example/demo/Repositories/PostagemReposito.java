package com.example.demo.Repositories;

import com.example.demo.Entities.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemReposito extends JpaRepository<Postagem, Integer> {
}
