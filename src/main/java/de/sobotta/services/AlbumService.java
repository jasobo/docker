package de.sobotta.services;

import de.sobotta.dto.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {
    public void save(Album album) {

    }

    public List<Album> find(String artist){
        List<Album> artistDiscography = new ArrayList<>();
        return artistDiscography;
    }

    public Album findSpec(long id){
        Album found = new Album();
        return found;
    }

    public void delete(long id){

    }
}
