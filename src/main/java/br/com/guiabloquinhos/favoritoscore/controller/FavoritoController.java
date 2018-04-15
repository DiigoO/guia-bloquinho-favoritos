package br.com.guiabloquinhos.favoritoscore.controller;


import br.com.guiabloquinhos.favoritoscore.model.Favorito;
import br.com.guiabloquinhos.favoritoscore.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "favorito")
public class FavoritoController {

    @Autowired
    public FavoritosService favoritosService;

    @PostMapping()
    public void salvar(@RequestBody Favorito favorito){
        favoritosService.salvar(favorito);
    }

    @GetMapping()
    public List<Favorito> buscarTodos(){
        return favoritosService.buscarTodos();
    }

}
