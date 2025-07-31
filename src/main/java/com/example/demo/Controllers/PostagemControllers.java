package com.example.demo.Controllers;

import com.example.demo.Entities.Autor;
import com.example.demo.Entities.Postagem;
import com.example.demo.Repositories.AutorRepositorie;
import com.example.demo.Repositories.PostagemReposito;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Autores/{idAutor}/Postagems")
public class PostagemControllers {
    private final AutorRepositorie autorRepositorie;
    private final PostagemReposito postagemReposito;

    public PostagemControllers(AutorRepositorie autorRepositorie,PostagemReposito postagemReposito){
        this.autorRepositorie = autorRepositorie;
        this.postagemReposito = postagemReposito;
    }

    @GetMapping
    public List<Postagem> listarPostagem(
            @PathVariable Integer idAutor
    ) {
        Autor autor = this.autorRepositorie.findById(idAutor).orElseThrow();
        return autor.getPostagems();
    }

    @PostMapping
    public Postagem criarPostagem(
            @RequestBody Postagem postagem,
            @PathVariable Integer idAutor
    ) {
        Autor autor = this.autorRepositorie.findById(idAutor).orElseThrow();

        postagem.setAutor(autor);
        this.postagemReposito.save(postagem);
        return postagem;
    }
}
