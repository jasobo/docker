package de.sobotta.controller;

import de.sobotta.dto.Album;
import de.sobotta.services.AlbumService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class HelloController {

    private AlbumService albumService;

    @Value("${spring.datasource.username}")
    private String username;
    @GetMapping("/")
    public String helloWorld(){
        return "hello world " +username;
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "hello " + name;
    }

    @PostMapping
    public void createNewAlbum(@RequestBody Album album){
        albumService.save(album);
    }

    @GetMapping("/{artist}")
    public List<Album> findByArtist(@PathVariable String artist){
        return albumService.find(artist);
    }

    @GetMapping("/specific/{id}")
    public Album findById(@PathVariable long id){
        return albumService.findSpec(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        albumService.delete(id);
    }
}
