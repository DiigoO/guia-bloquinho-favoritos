package br.com.guiabloquinhos.favoritoscore.repository;

import br.com.guiabloquinhos.favoritoscore.model.Favorito;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FavoritoRepository extends MongoRepository<Favorito, String> {
    Favorito findByIdBloquinhoAndIdUserEquals(String idBloquinho, String idUser);

    Favorito findByIdUser(String idUser);
}
