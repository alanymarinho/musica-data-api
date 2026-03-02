package exmp.musicdataapi.service;

import exmp.musicdataapi.entity.Albums;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumsService {

    //criar uma lista para armazenar os albuns cadastrados
    List<Albums> albumsList = new ArrayList<>();

    //gerar o id "automaticamente"
    private long nextId = 1L;

    //metodo para criar um album
    public Albums create(Albums request){
        Albums albums = new Albums(request.getName(), request.getArtistName(),
                request.getReleaseDate(), request.getStyleMusic(), request.getRecordLabel());
        albums.setId(nextId);
        albumsList.add(albums);
        return albums;
    }

    //consultar por nome do album
    public List<Albums> findByAlbum(String name){
        List<Albums> findByalbum = new ArrayList<>();
        for(Albums albums : albumsList){
            if(name.equalsIgnoreCase(albums.getName())){
                findByalbum.add(albums);
            }
        }
        return findByalbum;

    }


    //consultar pelo nome do artista

    //consultar pelo genero musical

    //consultar albums do mesmo artista

    //atualizar ou corrigir album cadastrado

    //apagar album


}
