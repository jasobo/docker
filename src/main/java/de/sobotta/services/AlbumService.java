package de.sobotta.services;

import de.sobotta.dto.Album;
import de.sobotta.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }
    public void save(Album album) {
        albumRepository.save(album);
    }
    public List<Album> showAll(){
        return albumRepository.findAll();
    }
    public List<Album> find(String artist){
        return albumRepository.findAllByArtist(artist);
    }

    public Album findSpec(String name){
        return albumRepository.findByName(name);
    }

    public void delete(long id){
        albumRepository.deleteById(id);
    }
}
