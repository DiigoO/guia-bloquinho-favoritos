package br.com.guiabloquinhos.favoritoscore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Favorito {

    @Id
    private String idUser;
    private String idBloquinho;

    public String getIdBloquinho() {
        return idBloquinho;
    }

    public void setIdBloquinho(String idBloquinho) {
        this.idBloquinho = idBloquinho;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}
