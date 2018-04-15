package br.com.guiabloquinhos.favoritoscore.service;

import br.com.guiabloquinhos.favoritoscore.model.Favorito;
import br.com.guiabloquinhos.favoritoscore.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {

    @Autowired
    FavoritoRepository favoritoRepository;

    public void salvar(Favorito favorito){
        Favorito sameFavoritos = favoritoRepository.findByIdBloquinhoAndIdUserEquals(favorito.getIdBloquinho(), favorito.getIdUser());
        if(sameFavoritos.getIdUser() != null && sameFavoritos.getIdBloquinho() != null){
            favorito.setIdUser(sameFavoritos.getIdUser());
            favorito.setIdBloquinho(sameFavoritos.getIdBloquinho());
        }
        favoritoRepository.save(favorito);
    }

    public Favorito buscarNota(String idUser){
        return favoritoRepository.findByIdUser(idUser);
    }


    public List<Favorito> buscarTodos(){
        return favoritoRepository.findAll();
    }
}
