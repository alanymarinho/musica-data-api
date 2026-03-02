package exmp.musicdataapi.service;

//class onde fica as regras de negocio
//controller depende da service

import exmp.musicdataapi.entity.Artist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {

    //criando uma lista para armazenar os artistas
    private List<Artist> artistList = new ArrayList<>();
    //gerar o id "automaticamente"
    private long nextId = 1L;

    //metodo para criar o artista
    public Artist create(Artist request){
        Artist artist = new Artist(request.getName(), request.getInActivity(), request.getActivityPeriod(),
                                    request.getType(), request.getStyleMusic());
        artist.setId(nextId++);
        artistList.add(artist);
        return artist;
    }

    //metodo para buscar artista pelo nome
    public List<Artist> findByName(String name){
        List<Artist> findByname = new ArrayList<>();
        for(Artist artist : artistList){
            if(name.equalsIgnoreCase(artist.getName())){
                findByname.add(artist);
            }
        }
        return findByname;
    }




    //listar artistas cadastrados
    public List<Artist> findAll(){
        return artistList;
    }

    //atualizar cadastro de um artista
    public Artist updateById(Long id, Artist request){

        for(Artist artist : artistList){

            if(artist.getId().equals(id)){
                artist.setName(request.getName());
                artist.setInActivity(request.getInActivity());
                artist.setActivityPeriod(request.getActivityPeriod());
                artist.setType(request.getType());
                artist.setStyleMusic(request.getStyleMusic());
            }
        }

        return null;
    }





    //apagar artista cadastrado
    public Boolean deleteById(Long id){
        for (int i = 0; i < artistList.size(); i++) {
            Artist artist = artistList.get(i);

            if(artist.getId().equals(id)){
                artistList.remove(i);
                return true;
            }

        }
        return false;
    }




}
