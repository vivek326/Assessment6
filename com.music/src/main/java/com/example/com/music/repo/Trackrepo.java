package com.example.com.music.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.com.music.model.Album;
import com.example.com.music.model.Artist;
import com.example.com.music.model.Track;

@Repository
public interface Trackrepo {
Track create(Track track);
List <Track> findall();
Album create(Album album);
List <Album> findalb();
Artist create(Artist artist);
List <Artist> findart();
}

