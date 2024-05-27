package de.sobotta.dto;

public class Album {
    private Long id;

    private String name;
    private String artist;
    private String titleTrack;

    public Album() {
    }

    public Album(String name, String artist, String titleTrack) {
        this.name = name;
        this.artist = artist;
        this.titleTrack = titleTrack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitleTrack() {
        return titleTrack;
    }

    public void setTitleTrack(String titleTrack) {
        this.titleTrack = titleTrack;
    }
}
