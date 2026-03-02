package exmp.musicdataapi.controller;

import exmp.musicdataapi.entity.Artist;
import exmp.musicdataapi.service.ArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class ArtistController {

    private final ArtistService service;

    public ArtistController(ArtistService service){
        this.service = service;
    }


    //cadastrar novos artistas
    @PostMapping("/create-artist")
    public Artist create(@RequestBody Artist request){
        return service.create(request);
    }

    //buscar por nome
    @GetMapping("/findByName")
    public List<Artist> findByName (@RequestParam String name){
        if(name == null || name.isBlank()){
            return List.of();
        }

        return service.findByName(name);
    }

    //listar todos os artistas cadastrados
    @GetMapping("/findAll")
    public List<Artist> findAll(){
        return service.findAll();
    }

    //atualizar cadastro de artista
    @PutMapping("/{id}")
    public Artist update(@PathVariable Long id, @RequestBody Artist request){
        return service.updateById(id,request);
    }





    //delete passado o id
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable Long id){
        return service.deleteById(id);

    }


}
