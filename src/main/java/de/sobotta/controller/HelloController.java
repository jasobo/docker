package de.sobotta.controller;

import de.sobotta.dto.Album;
import de.sobotta.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class HelloController {

    private final AlbumService albumService;

    @Autowired
    public HelloController (AlbumService albumService){
        this.albumService = albumService;
    }


    @GetMapping("/")
    public String helloWorld(){
        return "hello world ";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "hello " + name;
    }

    @PostMapping
    public void createNewAlbum(@RequestBody Album album){
        albumService.save(album);
    }

    @GetMapping("/all")
    public List<Album> showAll(){
        return albumService.showAll();
    }

    @GetMapping("/{artist}")
    public List<Album> findByArtist(@PathVariable String artist){
        return albumService.find(artist);
    }

    @GetMapping("/specific/{name}")
    public Album findByName(@PathVariable String name){
        return albumService.findSpec(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        albumService.delete(id);
    }
}
