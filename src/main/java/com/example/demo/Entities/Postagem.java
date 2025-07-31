package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String data;    
    @ManyToOne()
    @JoinColumn(name = "autor_id")
    @JsonIgnore()
    Autor autor;


    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
