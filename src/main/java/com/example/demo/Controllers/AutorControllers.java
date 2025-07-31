package com.example.demo.Controllers;

import com.example.demo.Entities.Autor;
import com.example.demo.Repositories.AutorRepositorie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Autores")
public class AutorControllers {
    private final AutorRepositorie autorRepositorie;

    public AutorControllers(AutorRepositorie autorRepositorie){
        this.autorRepositorie=autorRepositorie;
    }
    @GetMapping
    public List<Autor> listaAutor(){
        return this.autorRepositorie.findAll();
    }
    @PostMapping
    public Autor criarAutor (@RequestBody Autor autor){
        this.autorRepositorie.save(autor);
        return autor;
    }
}
